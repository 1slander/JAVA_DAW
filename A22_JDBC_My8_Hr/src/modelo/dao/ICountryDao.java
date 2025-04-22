package modelo.dao;

import java.util.List;

import modelo.javabean.Country;


public interface ICountryDao {
	
	List<Country> finadAll();
	Country findById(String countryId);
	int insertOne(Country country);
	int updateOne(Country country);
	int deleteOne(String countryId);
	
	List<Country> findByRegion(int regionId);

}
