package modelo.dao;

import java.util.List;

import modelo.javabean.Region;

public interface IRegionDao {
	
	List<Region> finadAll();
	Region findById(int regionId);
	int insertOne(Region region);

}
