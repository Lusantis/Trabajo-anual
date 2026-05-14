package sd;

public class Auto extends vehiculo {
	String modelo;
	int nropuerta;
	String tipodeauto;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNropuerta() {
		return nropuerta;
	}

	public void setNropuerta(int nropuerta) {
		this.nropuerta = nropuerta;
	}

	public String getTipodeauto() {
		return tipodeauto;
	}

	public void setTipodeauto(String tipodeauto) {
		this.tipodeauto = tipodeauto;
	}

	public Auto(int nrochasis, int nromotor, String marca, String modelo, int nropuerta, String tipodeauto) {
		super(nrochasis, nromotor, marca);
		this.modelo = modelo;
		this.nropuerta = nropuerta;
		this.tipodeauto = tipodeauto;
	}
}
