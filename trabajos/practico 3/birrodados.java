package sd;

public class birrodados extends vehiculo {
	String color;
	String tipodemoto;
	int año;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipodemoto() {
		return tipodemoto;
	}

	public void setTipodemoto(String tipodemoto) {
		this.tipodemoto = tipodemoto;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public birrodados(int nrochasis, int nromotor, String marca, String color, String tipodemoto, int año) {
		super(nrochasis, nromotor, marca);
		this.color = color;
		this.tipodemoto = tipodemoto;
		this.año = año;
	}

}
