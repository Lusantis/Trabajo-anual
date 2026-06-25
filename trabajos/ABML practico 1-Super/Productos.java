package practico;

public abstract class Productos {
	int CodBarra;
	String nombre;
	double precio;

	public int getCodBarra() {
		return CodBarra;
	}

	public void setCodBarra(int codBarra) {
		CodBarra = codBarra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Productos(int codBarra, String nombre, double precio) {
		super();
		CodBarra = codBarra;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo de barra: " + this.getCodBarra() + " Nombre :" + this.getNombre() + " Precio "
				+ this.getPrecio();
	}
}