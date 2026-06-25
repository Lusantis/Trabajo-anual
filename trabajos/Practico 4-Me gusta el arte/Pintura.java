package arreglos;

public class Pintura extends ObraArte {
	String tipo;
	int valor;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Pintura(int idobra, String autor, String nombre, String tipo, int valor) {
		super(idobra, autor, nombre);
		this.tipo = tipo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Pintura [tipo=" + tipo + ", valor=" + valor + ", idobra=" + idobra + ", autor=" + autor + ", nombre="
				+ nombre + "]";
	}
}
