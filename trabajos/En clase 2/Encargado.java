package empresa;

import java.util.Scanner;

public class Encargado {
	Scanner entrada = new Scanner(System.in);
	String nombre;
	int ci;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public Encargado(String nombre, int ci) {
		super();
		this.nombre = nombre;
		this.ci = ci;
	}

	public void mail() {
		System.out.println("cual es la ci de el destinatario");
		int destinatario = entrada.nextInt();
		if ((destinatario == 509234663) || (destinatario == 50987663)) {

			String mensaje;
			System.out.println("que desea ingresar");
			mensaje = entrada.next();
			System.out.println("el mensaje es " + mensaje);
		} else {
			System.out.println("usted no puede enviarle el mail");
		}
	}
}
