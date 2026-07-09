package interfaz;

public class Perro implements Acciones {
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

	public Perro(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("los perros comen 5kg");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("los perros duermen 12 horas");
	}

}
