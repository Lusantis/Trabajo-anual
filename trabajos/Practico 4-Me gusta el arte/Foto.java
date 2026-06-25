package arreglos;

public class Foto extends ObraArte {
	String fecha;
	String filtros;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFiltros() {
		return filtros;
	}

	public void setFiltros(String filtros) {
		this.filtros = filtros;
	}

	public Foto(int idobra, String autor, String nombre, String fecha, String filtros) {
		super(idobra, autor, nombre);
		this.fecha = fecha;
		this.filtros = filtros;
	}

	@Override
	public String toString() {
		return "Foto [fecha=" + fecha + ", filtros=" + filtros + ", idobra=" + idobra + ", autor=" + autor + ", nombre="
				+ nombre + "]";
	}
}
