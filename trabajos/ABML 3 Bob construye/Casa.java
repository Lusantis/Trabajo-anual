package practico;

public class Casa extends Edificio {
	int solar;
	int nrohabitaciones;

	public int getSolar() {
		return solar;
	}

	public void setSolar(int solar) {
		this.solar = solar;
	}

	public int getNrohabitaciones() {
		return nrohabitaciones;
	}

	public void setNrohabitaciones(int nrohabitaciones) {
		this.nrohabitaciones = nrohabitaciones;
	}

	public Casa(int nroPisos, String nombre, int numeroEdi, int solar, int nrohabitaciones) {
		super(nroPisos, nombre, numeroEdi);
		this.solar = solar;
		this.nrohabitaciones = nrohabitaciones;
	}

	@Override
	public String toString() {
		return "Casa [solar=" + solar + ", nrohabitaciones=" + nrohabitaciones + ", NroPisos=" + NroPisos + ", nombre="
				+ nombre + ", NumeroEdi=" + NumeroEdi + "]";
	}

}
