package javabean;

public class TesteEmpleado {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		
//		emp1.nombre ="tomas";
//		emp1.apellidos ="ESCUDERO";
//		emp1.salarioMensual=100_000;
//		emp1.genero='J';
		
		emp1.setNombre("Hector");
		
		System.out.println(emp1);
	}

}
