package javabean;

public class Administrativo extends PersonaAbstract {

	
	private String tareas;
	
	
	


	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public Administrativo() {
		super();
	}

	
	
	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	

	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El administrativo " + nombre + " va a realizar estas tareas: " + tareas;
	}
	
	public String gestionarMatriculas() {
		return "El administrativo " + nombre + " va a gestionar una matrícula";
	}
}
