package modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Region;

public class RegionDaoImplMy8Jdbc extends AbsGenericoDaoImpl implements IRegionDao {
	
	public RegionDaoImplMy8Jdbc() {
		super();
	}

	@Override
	public List<Region> finadAll() {
		sql = "select * from regions";
		List<Region> aux=new ArrayList<Region>();
		
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Region region=new Region();
				
				region.setRegionId(rs.getInt("region_id"));
//				region.setRegionId(rs.getInt(1));
				region.setRegionName(rs.getString("region_name"));
				
				aux.add(region);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
	}

	@Override
	public Region findById(int regionId) {
		sql="SELECT * FROM regions WHERE region_id = ?";
		Region region=null;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, regionId);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				region=new Region();
				region.setRegionId(rs.getInt("region_id"));
				region.setRegionName(rs.getString("region_name"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return region;
		
	}

	@Override
	public int insertOne(Region region) {
		sql="INSERT INTO regions (region_id, region_name) VALUES (?,?)";
		filas=0;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, region.getRegionId());
			ps.setString(2, region.getRegionName());
			
			filas = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas=0;
		}
		return filas;
	}

	@Override
	public int updateOne(Region region) {
		sql = "UPDATE regions SET region_name= ? WHERE region_id = ?";
		filas=0;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, region.getRegionName());
			ps.setInt(2, region.getRegionId());
			
			filas=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas=0;
		}
		
		return filas;
	}

	@Override
	public int deleteOne(int regionId) {
		sql="DELETE FROM regions WHERE region_id = ?";
		filas=0;
		
		try {
			//Set autocommit to false para que no aparezcan en la base datos
			//conn.setAutoCommit(false);
			ps=conn.prepareStatement(sql);
			ps.setInt(1, regionId);
			filas=ps.executeUpdate();
			
			//Hay que hacer el commit manual
			//conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas=-1;
		}
		return filas;
	}

}
