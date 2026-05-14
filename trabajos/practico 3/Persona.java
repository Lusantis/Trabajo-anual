package sd;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int cedula;

	public void setNombre(String n) {
		this.nombre = n;
	}

	public void setApellid(String a) {
		this.apellido = a;
	}

	public void setcCI(int s) {
		this.cedula = s;
	}

	public String getNombre() {
		return nombre;

	}

	public String getApellido() {
		return apellido;

	}

	public int getCI() {
		return cedula;

	}

	public Persona(String n, String a, int s) {
		this.nombre = n;
		this.apellido = a;
		this.cedula = s;
	}

}

