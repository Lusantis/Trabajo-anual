package sd;

public class triangulo extends FiguraGeometrica {
	String TipoTriangulo;
	int angulo;
	int AreaTriangulo;

	public String getTipoTriangulo() {
		return TipoTriangulo;
	}

	public void setTipoTriangulo(String tipoTriangulo) {
		TipoTriangulo = tipoTriangulo;
	}

	public int getAngulo() {
		return angulo;
	}

	public void setAngulo(int angulo) {
		this.angulo = angulo;
	}

	public int getAreaTriangulo() {
		return AreaTriangulo;
	}

	public void setAreaTriangulo(int areaTriangulo) {
		AreaTriangulo = areaTriangulo;
	}

	public triangulo(int largo, int ancho, int altura, String tipoTriangulo, int angulo, int areaTriangulo) {
		super(largo, ancho, altura);
		TipoTriangulo = tipoTriangulo;
		this.angulo = angulo;
		AreaTriangulo = areaTriangulo;
	}
}
