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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertOne(Region region) {
		// TODO Auto-generated method stub
		return 0;
	}

}
