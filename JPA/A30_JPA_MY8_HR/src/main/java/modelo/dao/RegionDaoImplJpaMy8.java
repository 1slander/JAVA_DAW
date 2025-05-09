package modelo.dao;

import java.util.List;

import modelo.entities.Region;

public class RegionDaoImplJpaMy8 extends AbsGenericoJpa implements IRegionDao {
	
	public RegionDaoImplJpaMy8() {
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Region> finadAll() {
		jpql="from Region r"; // select * from regions
		query=em.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public Region findById(int regionId) {
		
		return em.find(Region.class,regionId);
	}
	
	// JPA tiene el autocommit deshabilitado
	//JPA levante excepciones de tipo RunTimeException : no checkek

	@Override
	public int insertOne(Region region) {
			try {
				tx.begin();
				em.persist(region);
				tx.commit();
				filas=1;
			}catch(Exception e) {
				e.printStackTrace();
				filas=0;
			}
		return filas;
	}

	@Override
	public int updateOne(Region region) {
		try {
			if(findById(region.getRegionId())!=null) {
				tx.begin();
				em.merge(region);
				tx.commit();
				filas= 1;
			} else {
				filas =0;
				
			}
		} catch(Exception e) {
			e.printStackTrace();
			filas=0;
		}
		return filas;
	}

	@Override
	public int deleteOne(int regionId) {
		Region region=null;
		try {
			region=findById(regionId);
			if(findById(regionId)!=null) {
				tx.begin();
				em.remove(region);
				tx.commit();
				filas= 1;
			} else {
				filas =0;
				
			}
		} catch(Exception e) {
			e.printStackTrace();
			filas=-1;
		}
		return filas;
	}
	
	

}
