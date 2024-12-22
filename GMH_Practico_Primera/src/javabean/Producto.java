package javabean;

public class Producto {
	
	private long codigoDeBarra;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	
	
	
	public Producto(long codigoDeBarra, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.codigoDeBarra = codigoDeBarra;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}
	
	

	public Producto() {
		super();
	}

	
	


	
	
	public long getCodigoDeBarra() {
		return codigoDeBarra;
	}



	public void setCodigoDeBarra(long codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPrecioUnitario() {
		return precioUnitario;
	}



	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}



	public int getCantidadStock() {
		return cantidadStock;
	}



	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}



	public String getTalla() {
		return talla;
	}



	public void setTalla(String talla) {
		this.talla = talla;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "Producto [codigoDeBarra=" + codigoDeBarra + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}


	
	/*
	 * METODOS PROPIOS
	 */
	
	


	 public double precioConIva(int iva) {
	        return precioUnitario * (1 + iva / 100.0);
	    }
	
	public void aumentarStock(int cantidad) {
		cantidadStock += cantidad;
	}
	
	public boolean disminuirStock(int cantidad) {
		 
		if(cantidadStock - cantidad < 0 ) return false;
		else {
			cantidadStock-=cantidad;
			return true;
		}
	}
		
		public double precioAplicado() {
			
			switch (talla.toUpperCase()) {
            case "S":
            case "M":
            case "L":
            case "XL":
                return precioUnitario * 1.03;
            case "XXL":
            case "XXXL":
                return precioUnitario * 1.04;
            default:
                return precioUnitario;
		
			}

		}
}
