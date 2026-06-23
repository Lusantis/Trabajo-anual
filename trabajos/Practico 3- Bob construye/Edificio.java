package practico;

public abstract class Edificio {
	int NroPisos;
	String nombre;
	int NumeroEdi;

	public int getNroPisos() {
		return NroPisos;
	}

	public void setNroPisos(int nroPisos) {
		NroPisos = nroPisos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroEdi() {
		return NumeroEdi;
	}

	public void setNumeroEdi(int numeroEdi) {
		NumeroEdi = numeroEdi;
	}

	public Edificio(int nroPisos, String nombre, int numeroEdi) {
		super();
		NroPisos = nroPisos;
		this.nombre = nombre;
		NumeroEdi = numeroEdi;
	}

	@Override
	public String toString() {
		return "Edificio [NroPisos=" + NroPisos + ", nombre=" + nombre + ", NumeroEdi=" + NumeroEdi + ", getNroPisos()="
				+ getNroPisos() + ", getNombre()=" + getNombre() + ", getNumeroEdi()=" + getNumeroEdi();
	}

}
