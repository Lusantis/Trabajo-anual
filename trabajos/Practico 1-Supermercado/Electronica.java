package practico;

public class Electronica extends Productos {
	String marca;
	String modelo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Electronica(int codBarra, String nombre, double precio, String marca, String modelo) {
		super(codBarra, nombre, precio);
		this.marca = marca;
		this.modelo = modelo;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo de barra: " + this.getCodBarra() + " Nombre: " + this.getNombre() + " Precio: "
				+ this.getPrecio() + " Marca: " + this.getMarca() + " Modelo: " + this.getModelo();
	}
}
