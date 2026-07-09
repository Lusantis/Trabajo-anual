package interfaz;

public class Dinosaurio implements Acciones {
	String nombre;
	int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Dinosaurio(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public void comer() {
		System.out.println("los dinosaurios comen 1T");
	}

	@Override
	public void dormir() {
		System.out.println("los dinosaurios duermen 6 horas");
	}

}
