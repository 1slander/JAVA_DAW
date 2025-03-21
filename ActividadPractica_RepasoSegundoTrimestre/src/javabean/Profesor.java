package javabean;

public class Profesor extends PersonaAbstract {
	
	private String competencias;
	
	
	

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	public Profesor() {
		super();
	}
	
	

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	
	
	
	@Override
	public String toString() {
		return "Profesor [competencias=" + competencias + ", nif=" + nif + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}

	@Override
	public String trabajar() {
		
		return "El profesor " + nombre + " va a impartir su clase.";
	}
	
	public String ponerNotas() {
		return "El profesor " + nombre + " va a corregir los exámenes.";
	}
	

}
