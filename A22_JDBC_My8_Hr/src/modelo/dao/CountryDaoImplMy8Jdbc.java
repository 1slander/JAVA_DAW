package modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Country;
import modelo.javabean.Region;

public class CountryDaoImplMy8Jdbc extends AbsGenericoDaoImpl implements ICountryDao {
	
	private IRegionDao rdao;
	
	public CountryDaoImplMy8Jdbc() {
		super();
		rdao= new RegionDaoImplMy8Jdbc();
	}

	@Override
	public List<Country> finadAll() {
		
		sql = "SELECT * FROM countries WHERE region_id = ?";
		List<Country> aux=new ArrayList<Country>();
		try {
			ps=conn.prepareStatement(sql);
		
			rs=ps.executeQuery();
			
			while (rs.next()) {
				Country country = new Country();
				country.setCountryId(rs.getString("country_id"));
				country.setCountryName(rs.getString("country_name"));
				country.setRegion(rdao.findById(rs.getInt("region_id")));
				aux.add(country);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aux;
	
	}

	@Override
	public Country findById(String countryId) {
		sql="SELECT * FROM countries WHERE country_id = ?";
		Country country = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, countryId);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				country = new Country();
				country.setCountryId(rs.getString("country_id"));
				country.setCountryName(rs.getString("country_name"));
				country.setRegion(rdao.findById(rs.getInt("region_id")));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return country;
	}

	@Override
	public int insertOne(Country country) {
		sql="INSERT INTO countries (country_id, country_name, region_id) VALUES (?,?)";
		filas=0;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, country.getCountryId());
			ps.setString(2, country.getCountryName());
			ps.setInt(3, country.getRegion().getRegionId());
			
			filas = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas=0;
		}
		return filas;
	}

	@Override
	public int updateOne(Country country) {
		sql = "UPDATE countries SET country_name= ?, region_id=? WHERE country_id = ?";
		filas=0;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, country.getCountryName());
			ps.setInt(2, country.getRegion().getRegionId());
			ps.setString(3, country.getCountryId());
			
			filas=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas=0;
		}
		
		return filas;
	}

	@Override
	public int deleteOne(String countryId) {
		sql="DELETE FROM countries WHERE country_id = ?";
		filas=0;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, countryId);
			filas=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas=-1;
		}
		return filas;
	}

	@Override
	public List<Country> findByRegion(int regionId) {
		Region region= rdao.findById(regionId);
		if(region == null)
			return null;
		
		sql = "SELECT * FROM countries WHERE region_id = ?";
		List<Country> aux=new ArrayList<Country>();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, regionId);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				Country country = new Country();
				country.setCountryId(rs.getString("country_id"));
				country.setCountryName(rs.getString("country_name"));
				country.setRegion(region);
				aux.add(country);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aux;
	}

}
