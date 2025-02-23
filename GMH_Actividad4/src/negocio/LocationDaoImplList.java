package negocio;

import java.util.ArrayList;
import java.util.List;


import javabean.Location;

public class LocationDaoImplList implements ILocationDao {
	
	private List<Location> lista;
	
	private ICountryDao iCountryDao;
	
	
	public LocationDaoImplList() {
		lista = new ArrayList<Location>();
		iCountryDao = new CountryDaoImplList();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Location(1500, "pez 3", "28008", "Madrid", "Madrid", iCountryDao.findById("ES")));
		lista.add(new Location(1600, "nuez 3", "28016", "Madrid", "Madrid", iCountryDao.findById("ES")));
		lista.add(new Location(1700, "rosa 34", "19002", "Guadalajara", "Guadalajara", iCountryDao.findById("ES")));
		lista.add(new Location(1800, "perro 13", "35004", "Las Palmas de Gran Canaria", "Las Palmas", iCountryDao.findById("ES")));
		lista.add(new Location(1900, " 16 springland close", "IP4 5BZ", "Ipswich", "Suffolk", iCountryDao.findById("UK")));
		lista.add(new Location(2000, "plata 34", "99202", "Buenos Aires", "Argentina", iCountryDao.findById("AR")));
		
	}

	@Override
	public Location findById(Integer atributoPk) {
		for (Location ele: lista) {
			if (ele.getLocationId() == atributoPk)
				return ele;
		}
		
		return null;
	}

	@Override
	public int insertOne(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}
	
	/* METODOS IMPLEMENTADOS */

	@Override
	public List<Location> buscarPorCity(String city) {
		List<Location> aux = new ArrayList<Location>();
		for (Location ele : lista) {
			if(ele.getCity().equals(city)){
				aux.add(ele);
			} 
			
		}
		if(aux.isEmpty())
			System.out.println("No se encontraron localizaciones con esa ciudad");
		return aux;
	}

	@Override
	public List<Location> buscarPorPostalCode(String postalCode) {
		List<Location> aux = new ArrayList<Location>();
		for (Location ele : lista) {
			if(ele.getPostalCode().equals(postalCode)){
				aux.add(ele);
			} 
			
		}
		if(aux.isEmpty())
			System.out.println("No se encontraron localizaciones con ese codigo postal");
		return aux;
	}

	@Override
	public List<Location> buscarPorPais(String countryId) {
		List<Location> aux = new ArrayList<Location>();
		for (Location ele : lista) {
			if(ele.getCountry().getCountryName().equals(countryId)){
				aux.add(ele);
			} 
			
		}
		if(aux.isEmpty())
			System.out.println("No se encontraron localizaciones con ese pais");
		return aux;
	}

}
