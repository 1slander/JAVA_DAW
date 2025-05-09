package modelo.dao;

import java.util.List;

import modelo.entities.Region;

public interface IRegionDao {
	
	List<Region> finadAll();
	Region findById(int regionId);
	int insertOne(Region region);
	int updateOne(Region region);
	int deleteOne(int regionId);

}
