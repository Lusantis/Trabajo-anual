package arreglos;

public class Escultura extends ObraArte {
	String materiales;
	double tamaño;

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public Escultura(int idobra, String autor, String nombre, String materiales, double tamaño) {
		super(idobra, autor, nombre);
		this.materiales = materiales;
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Escultura [materiales=" + materiales + ", tamaño=" + tamaño + ", idobra=" + idobra + ", autor=" + autor
				+ ", nombre=" + nombre + "]";
	}
}
