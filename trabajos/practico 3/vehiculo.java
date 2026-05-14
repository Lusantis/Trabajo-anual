package sd;

public abstract class vehiculo {
	int nrochasis;
	int nromotor;
	String marca;

	public int getNrochasis() {
		return nrochasis;
	}

	public void setNrochasis(int nrochasis) {
		this.nrochasis = nrochasis;
	}

	public int getNromotor() {
		return nromotor;
	}

	public void setNromotor(int nromotor) {
		this.nromotor = nromotor;
	}

	public String getModelo() {
		return marca;
	}

	public void setModelo(String marca) {
		this.marca = marca;
	}

	public vehiculo(int nrochasis, int nromotor, String marca) {
		this.nrochasis = nrochasis;
		this.nromotor = nromotor;
		this.marca = marca;
	}
}
