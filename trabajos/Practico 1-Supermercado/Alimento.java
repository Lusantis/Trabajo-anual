package practico;

public class Alimento extends Productos {
	String tipo;
	String origen;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Alimento(int codBarra, String nombre, double precio, String tipo, String origen) {
		super(codBarra, nombre, precio);
		this.tipo = tipo;
		this.origen = origen;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo de barra: " + this.getCodBarra() + " Nombre :" + this.getNombre() + " Precio: "
				+ this.getPrecio() + " tipo: " + this.getTipo() + " Origen: " + this.getOrigen();
	}

}
