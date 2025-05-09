package modelo.dao;

import java.util.List;

import modelo.entities.Country;

public class CountryDaoImplJpaMy8 extends AbsGenericoJpa implements ICountryDao {

	public CountryDaoImplJpaMy8() {
		super();
	}
	
	@Override
	public List<Country> finadAll() {
		jpql="from Country c";
		query=em.createQuery(jpql);
		
		return query.getResultList();
	}

	@Override
	public Country findById(String countryId) {
		// TODO Auto-generated method stub
		return em.find(Country.class, countryId);
	}

	@Override
	public int insertOne(Country country) {
		try {
			tx.begin();
			em.persist(country);
		tx.commit();
		filas=1;		
		}catch(Exception e) {
			e.printStackTrace();
			filas=0;
		}
		
		
		
		return filas;
	}

	@Override
	public int updateOne(Country country) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(String countryId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Country> findByRegion(int regionId) {
		//jpql="FROM Country c WHERE c.region.regionId= ?1";
		jpql="FROM Country c WHERE c.region.regionId= :regionId";
		query=em.createQuery(jpql);
		//query.setParameter(1, regionId);
		query.setParameter("regionId", regionId);
		
		return query.getResultList();
	}

}
