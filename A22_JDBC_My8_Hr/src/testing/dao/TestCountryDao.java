package testing.dao;

import java.util.List;

import modelo.dao.CountryDaoImplMy8Jdbc;
import modelo.dao.ICountryDao;
import modelo.javabean.Country;

public class TestCountryDao {

	public static void main(String[] args) {
		
		ICountryDao cdao = new CountryDaoImplMy8Jdbc();
		
		System.out.println("PAIS AR: " + cdao.findById("AR"));
		
		System.out.println("\n LISTADO DE PAISE CON REGION 1");
		List<Country> lista = cdao.findByRegion(1);
		if(lista != null) {
		for(Country ele: lista) {
			System.out.println(ele);
		}
			
		} else {
			System.out.println("Este Pais no existe");
		}
	}

}
