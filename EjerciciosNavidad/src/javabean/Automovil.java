package javabean;

public class Automovil {
	
		private String marca;
		private String anoFabricacion;
		private int motor;
		private String combustible;
		private String tipoDeVehiculo;
		private int numPuertas;
		private int numPlazas;
		private int velocidadMax;
		private Color color;
		private int velocidadActual;
		
		public enum Color{
			BLANCO,
			NEGRO,
			ROJO,
			NARANJA,
			AMARILLO,
			VERDE,
			AZUL,
			VIOLETA
		}
		
		
		
		public Automovil() {
			super();
		}



		public Automovil(String marca, String anoFabricacion, int motor, String combustible,
				String tipoDeVehiculo, int numPuertas, int numPlazas, int velocidadMax, Color color,
				int velocidadActual) {
			super();
			this.marca = marca;
			this.anoFabricacion = anoFabricacion;
			this.motor = motor;
			this.combustible = combustible;
			this.tipoDeVehiculo = tipoDeVehiculo;
			this.numPuertas = numPuertas;
			this.numPlazas = numPlazas;
			this.velocidadMax = velocidadMax;
			this.color = color;
			this.velocidadActual = velocidadActual;
		}



		public String getMarca() {
			return marca;
		}



		public void setMarca(String marca) {
			this.marca = marca;
		}



		public String getAnoFabricacion() {
			return anoFabricacion;
		}



		public void setAnoFabricacion(String anoFabricacion) {
			this.anoFabricacion = anoFabricacion;
		}



		public int getMotor() {
			return motor;
		}



		public void setMotor(int motor) {
			this.motor = motor;
		}



		public String getCombustible() {
			return combustible;
		}



		public void setCombustible(String combustible) {
			this.combustible = combustible;
		}



		public String getTipoDeVehiculo() {
			return tipoDeVehiculo;
		}



		public void setTipoDeVehiculo(String tipoDeVehiculo) {
			this.tipoDeVehiculo = tipoDeVehiculo;
		}



		public int getNumPuertas() {
			return numPuertas;
		}



		public void setNumPuertas(int numPuertas) {
			this.numPuertas = numPuertas;
		}



		public int getNumPlazas() {
			return numPlazas;
		}



		public void setNumPlazas(int numPlazas) {
			this.numPlazas = numPlazas;
		}



		public int getVelocidadMax() {
			return velocidadMax;
		}



		public void setVelocidadMax(int velocidadMax) {
			this.velocidadMax = velocidadMax;
		}



		public Color getColor() {
			return color;
		}



		public void setColor(Color color) {
			this.color = color;
		}



		public int getVelocidadActual() {
			return velocidadActual;
		}



		public void setVelocidadActual(int velocidadActual) {
			this.velocidadActual = velocidadActual;
		}



		@Override
		public String toString() {
			return "Ejercicio1Automovil [marca=" + marca + ", anoFabricacion=" + anoFabricacion + ", motor=" + motor
					+ ", combustible=" + combustible + ", tipoDeVehiculo=" + tipoDeVehiculo + ", numPuertas="
					+ numPuertas + ", numPlazas=" + numPlazas + ", velocidadMax=" + velocidadMax + ", color=" + color
					+ ", velocidadActual=" + velocidadActual + "]";
		}
		
		
		/*
		 * METODOS PROPIOS
		 */
		
		public int acelerar(int velocidad) {
			velocidadActual += velocidad;
			System.out.println("Acelarmos " + velocidad + " km/h y deberiamos llegar a " + velocidadActual + " km/h");
			//if(velocidadActual == velocidadMax) return velocidadActual;
			if(velocidadActual >= velocidadMax) { 
				System.out.println("No podemos acelerar mas, velocidad maxima alcanzada");
				return velocidadActual=velocidadMax;}
	
			return velocidadActual;
			
		}
		
		public int desacelerar(int velocidad) {
			velocidadActual-=velocidad;
			System.out.println("Desacelarmos " + velocidad + " km/h y reducimos a " + velocidadActual + " km/h");
			
			if(velocidadActual == 0) {
				frenar();
				return velocidadActual;
			}
			if(velocidadActual <= 0) {
				
				frenar();
				return velocidadActual;
			}
			
			return velocidadActual;
			
		}
		
		public void frenar() {
			velocidadActual = 0;
			System.out.println("El coche ha frenado y se encuentra parado!");
		}
		
		
		public String tiempoEstimadoDeLlegada(int distancia) {
			if(velocidadActual == 0) return "El coche esta parado, no se puede calcular";
			int tiempo = distancia / velocidadActual;
			return "Tardaremos en llegar: " + tiempo + " minutos";
			
			
		}
		
		 public void mostrarAtributos() {
		        System.out.println("Marca: " + marca);
		        System.out.println("Modelo: " + anoFabricacion);
		        System.out.println("Motor: " + motor + " litros");
		        System.out.println("Tipo de Combustible: " + combustible);
		        System.out.println("Tipo de Automóvil: " + tipoDeVehiculo);
		        System.out.println("Número de Puertas: " + numPuertas);
		        System.out.println("Cantidad de Asientos: " + numPlazas);
		        System.out.println("Velocidad Máxima: " + velocidadMax + " km/h");
		        System.out.println("Color: " + color);
		        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
		    }
		
		
		
}
