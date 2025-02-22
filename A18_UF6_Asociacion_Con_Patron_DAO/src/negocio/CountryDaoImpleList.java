package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Country;
import javabean.Region;

public class CountryDaoImpleList implements ICountryDao {
	
	private List<Country> lista;
	
	private IRegionDao iRegionDao;
	
	public CountryDaoImpleList() {
		lista=new ArrayList<Country>();
		iRegionDao= new RegionDaoImplList();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Country("ES", "España", iRegionDao.findById(1) ));
		lista.add(new Country("FR", "Francia", iRegionDao.findById(1)));
		lista.add(new Country("GR", "Alemania", iRegionDao.findById(1)));
		lista.add(new Country("US", "Estados Unidos", iRegionDao.findById(3)));
		lista.add(new Country("MO", "Marruecos", iRegionDao.findById(5)));
	}

	@Override
	public Country findById(String atributoPK) {
		for(Country country : lista) {
			if(country.getCountryId().equals(atributoPK))
				return country;
		}
		return null;
	}

	@Override
	public int insertOne(Country object) {
		if(lista.contains(object)) {
			return 0;
		}else {
			lista.add(object);
			return 1;
		}
		
	}

	@Override
	public int updateOne(Country object) {
		int position = lista.indexOf(object);
		if(position != -1) {
			lista.set(position, object);
			return 1;
		} 
		return 0;
		
	}

	@Override
	public int deleteById(String atributoPK) {
		Country country = findById(atributoPK);
		return deleteObj(country);
		
		//return deleteObj(findById(atributoPK));
	}

	@Override
	public int deleteObj(Country object) {
		
		return lista.remove(object) ? 1:0;
	}

	@Override
	public List<Country> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public List<Country> buscarPorRegion(int regionId) {
		
		List<Country> aux = new ArrayList<Country>();
		
		for(Country country : lista) {
			if(country.getRegion().getRegionId() == regionId)
				aux.add(country);
			
		}
		return aux;
	}

	@Override
	public List<Country> buscarPorEmpiezaEnName(String cadena) {
		List<Country> aux = new ArrayList<Country>();
		
		for(Country country : lista) {
			if(country.getCountryName().startsWith(cadena))
				aux.add(country);
			
		}
		return aux;
	}
	
	

}
