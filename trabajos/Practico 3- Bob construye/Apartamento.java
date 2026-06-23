package practico;

public class Apartamento extends Edificio {
	int gastoscom;
	String ubicacion;

	public int getGastoscom() {
		return gastoscom;
	}

	public void setGastoscom(int gastoscom) {
		this.gastoscom = gastoscom;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Apartamento(int nroPisos, String nombre, int numeroEdi, int gastoscom, String ubicacion) {
		super(nroPisos, nombre, numeroEdi);
		this.gastoscom = gastoscom;
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Apartamento [gastoscom=" + gastoscom + ", ubicacion=" + ubicacion + ", NroPisos=" + NroPisos
				+ ", nombre=" + nombre + ", NumeroEdi=" + NumeroEdi + "]";
	}

}
