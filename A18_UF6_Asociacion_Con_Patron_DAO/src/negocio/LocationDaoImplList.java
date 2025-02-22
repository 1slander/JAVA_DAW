package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Location;
import javabean.Region;

public class LocationDaoImplList implements ILocationDao {
	
	private List<Location> lista;
	
	private ICountryDao iCountryDao;
	
	public LocationDaoImplList() {
		lista = new ArrayList<Location>();
		iCountryDao = new CountryDaoImpleList();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Location(1500, "pez 3", "28008", "Madrid", "Madrid", iCountryDao.findById("ES")));
		lista.add(new Location(1600, "nuez 3", "28018", "Madrid", "Madrid", iCountryDao.findById("ES")));
		lista.add(new Location(1700, "rosa 34", "18008", "Guadalajara", "Guadalajara", iCountryDao.findById("ES")));
	}

	@Override
	public Location findById(Integer atributoPK) {
		for(Location location:lista) {
			if(location.getLocationId() == atributoPK)
				return location;
		}
		return null;
	}

	@Override
	public int insertOne(Location object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Location object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPK) {
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Location object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

}
