package practico;

public class ropa extends Productos {
	String tela;
	String estacion;

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	public ropa(int codBarra, String nombre, double precio, String tela, String estacion) {
		super(codBarra, nombre, precio);
		this.tela = tela;
		this.estacion = estacion;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo de barra: " + this.getCodBarra() + " Nombre :" + this.getNombre() + " Precio: "
				+ this.getPrecio() + " Tela: " + this.getTela() + " Estacion: " + this.getEstacion();
	}
}
