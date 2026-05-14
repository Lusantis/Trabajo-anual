package sd;

public class circulo extends FiguraGeometrica {
	int radio;
	String CentroCirculo;
	int circunferencia;

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String getCentroCirculo() {
		return CentroCirculo;
	}

	public void setCentroCirculo(String centroCirculo) {
		CentroCirculo = centroCirculo;
	}

	public int getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(int circunferencia) {
		this.circunferencia = circunferencia;
	}

	public circulo(int largo, int ancho, int altura, int radio, String centroCirculo, int circunferencia) {
		super(largo, ancho, altura);
		this.radio = radio;
		CentroCirculo = centroCirculo;
		this.circunferencia = circunferencia;
	}
}
