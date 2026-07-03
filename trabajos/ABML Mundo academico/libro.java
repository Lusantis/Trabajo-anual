package practico;

public class libro extends Publicacion {
	int nropaginas;
	String tipoTapa;

	public int getNropaginas() {
		return nropaginas;
	}

	public void setNropaginas(int nropaginas) {
		this.nropaginas = nropaginas;
	}

	public String getTipoTapa() {
		return tipoTapa;
	}

	public void setTipoTapa(String tipoTapa) {
		this.tipoTapa = tipoTapa;
	}

	public libro(int fecha, String nombre, String autor, int nropaginas, String tipoTapa) {
		super(fecha, nombre, autor);
		this.nropaginas = nropaginas;
		this.tipoTapa = tipoTapa;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Fecha: " + this.getFecha() + " Nombre: " + this.getNombre() + " Autor: " + this.getAutor()
				+ " Nro Paginas: " + this.getNropaginas() + " Tipo de tapa: " + this.getTipoTapa();
	}

}
