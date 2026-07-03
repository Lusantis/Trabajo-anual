package practico;

public class ArticuloCientifico extends Publicacion {
	String orientacion;
	String tema;

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public ArticuloCientifico(int fecha, String nombre, String autor, String orientacion, String tema) {
		super(fecha, nombre, autor);
		this.orientacion = orientacion;
		this.tema = tema;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Fecha: " + this.getFecha() + " Nombre: " + this.getNombre() + " Autor: " + this.getAutor()
				+ " Orientacion: " + this.getOrientacion() + " Tema: " + this.getTema();
	}

}
