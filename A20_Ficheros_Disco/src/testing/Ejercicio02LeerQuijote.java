package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02LeerQuijote {

	public static void main(String[] args) {
		
		// Fuente el fichero en disco
		File fichero = new File("/Users/hector/repos/quijote.txt");
		String linea = null;
		// El flujo
		try {
			FileReader fileReader=new FileReader(fichero);
			BufferedReader bf=new BufferedReader(fileReader);
			linea= bf.readLine();
			
			while(linea != null) {
			System.out.println(linea);
			linea= bf.readLine();
			}
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("SEGUNDA LECTURA CON SCANNER");
		try {
			Scanner leer = new Scanner(fichero);
			while (leer.hasNext()) {
				System.out.println(leer.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("lectura terminada");
	}

}
