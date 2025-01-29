package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TrabajarConColecciones {

	public static void main(String[] args) {
		
		List<String> nombres, palabras;
		
		nombres = new ArrayList<String>();
		//nombres.add("Tomas");
		
		
		System.out.println("DE ARRAYLIST");
		nombres = List.of("Tomas", "Andres", "Eva", "Sara", "Carlos", "Tomas");
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		System.out.println(nombres.contains("Sara"));
		System.out.println(nombres.get(2));
		
		palabras = new LinkedList<String>();
		
		System.out.println("DE SET");
		
		Set<String> otros = new HashSet<String>();
		otros.add("Tomas");
		otros.add("Esteban");
		otros.add("Antonio");
		otros.add("Tomas");
		
		
		for (String nombre : otros) {
			System.out.println(nombre);
		}
		
		System.out.println("DE MAP");
		
		Map<Integer, String> mapa = new HashMap<Integer,String>();
		mapa.put(1, "Casillas");
		mapa.put(2, "Carvajal");
		mapa.put(4, "Sergio Ramos");
		mapa.put(9, "Lewandoski");
		
		for(Integer numero : mapa.keySet()) {
			System.out.println(numero);
			System.out.println(mapa.get(numero));
		}
		
		for (String nombre : mapa.values()) {
			System.out.println(nombre);
		}
		
		System.out.println("NOMBRES DEL METODO");
		
		for(String nombre: getNombres()) {
			System.out.println("Nombre rarito : " + nombre);
		}
		
		List<String> lista = getNombres();
		
		for(String nombre: lista) {
			System.out.println("Nombre rarito : " + nombre);
		}
		
		
		
	}
	
	public static List<String> getNombres(){
		List<String> misNombres = new ArrayList<String>();
		misNombres.add("Gorgonio");
		misNombres.add("Sindulfo");
		misNombres.add("Gregorio");
		
		return misNombres;
	}

}
