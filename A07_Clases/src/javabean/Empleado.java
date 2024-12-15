package javabean;

public class Empleado {

	// Atributos de instancia o de objeto
	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private double salario;
	private double complementos;
	private char genero;

	
	public Empleado(int idEmpleado,String nombre, String apellidos, double salario, double complementos, char genero) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.salario=salario;
		this.complementos=complementos;
		this.genero=genero;
		
	}
	
	public Empleado() {}
	// getters and setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComplementos() {
		return complementos;
	}

	public void setComplementos(double complementos) {
		this.complementos = complementos;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", salario=" + salario + ", complementos=" + complementos + ", genero=" + genero + "]";
	}
	
	// Metodos Propios
	
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	public double salarioAnual(int meses) {
		return salario * meses;
	}
	
	// Metodos reescritos de object
	
	
	
//	@Override
//	public String toString() {
//		return "Empleado[ idEmpleado : " + this.getIdEmpleado() + " nombre : " + this.getNombre();
//	}
	
	

}
