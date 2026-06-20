package practico;

public class Revista extends Publicacion {
	String idioma;
	String editorial;

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Revista(String fecha, String nombre, String autor, String idioma, String editorial) {
		super(fecha, nombre, autor);
		this.idioma = idioma;
		this.editorial = editorial;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Fecha: " + this.getFecha() + " Nombre: " + this.getNombre() + " Autor: " + this.getAutor() + " Idioma: "
				+ this.getIdioma() + " Editorial: " + this.getEditorial();
	}

}
