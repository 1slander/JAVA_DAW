package testobjetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import javabean.Contacto;

public class TestIOContactos {

	public static void main(String[] args) {
		
		grabarContactos();
		//leerContactos();

	}
	
	public static void grabarContactos() {
		
		Contacto contacto = new Contacto(1, "Eva", "Goma", "666777888", LocalDate.of(1997, 04, 25));
		
		File fichero = new File("/Users/hector/repos/contactos.obj");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos = new FileOutputStream(fichero);
			oos= new ObjectOutputStream(fos);
			oos.writeObject(contacto);
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			
			
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
	
		}
		}

	}
	
	
	public static void leerContactos() {
		
		Contacto contacto = null;
		File fichero = new File("");
		FileInputStream fis = null;
		
	}
		
	}


