package practico;

public abstract class Publicacion {
	String fecha;
	String nombre;
	String autor;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Publicacion(String fecha, String nombre, String autor) {
		super();
		this.fecha = fecha;
		this.nombre = nombre;
		this.autor = autor;
	}
}
