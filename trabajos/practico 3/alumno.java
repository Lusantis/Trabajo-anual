package sd;

public class alumno extends Persona {
	int nrolista;
	int calificacion;
	String juicio;

	public int getNrolista() {
		return nrolista;
	}

	public void setNrolista(int nrolista) {
		this.nrolista = nrolista;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String getJuicio() {
		return juicio;
	}

	public void setJuicio(String juicio) {
		this.juicio = juicio;
	}

	public alumno(String nombre, String apellido, int cedula, int nrolista, int calificacion, String juicio) {
		super(nombre, apellido, cedula);
		this.nrolista = nrolista;
		this.calificacion = calificacion;
		this.juicio = juicio;
	}
}
