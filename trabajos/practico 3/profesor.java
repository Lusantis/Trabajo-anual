package sd;

public class profesor extends Persona {
	int nrodegrupos;
	String especificacion;
	double sueldo;

	public int getNrodegrupos() {
		return nrodegrupos;
	}

	public void setNrodegrupos(int nrodegrupos) {
		this.nrodegrupos = nrodegrupos;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public profesor(String nombre, String apellido, int cedula, int nrodegrupos, String especificacion, double sueldo) {
		super(nombre, apellido, cedula);
		this.nrodegrupos = nrodegrupos;
		this.especificacion = especificacion;
		this.sueldo = sueldo;
	}
}
