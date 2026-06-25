package arreglos;

public abstract class ObraArte {
	int idobra;
	String autor;
	String nombre;

	public int getIdobra() {
		return idobra;
	}

	public void setIdobra(int idobra) {
		this.idobra = idobra;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ObraArte(int idobra, String autor, String nombre) {
		super();
		this.idobra = idobra;
		this.autor = autor;
		this.nombre = nombre;
	}
}
