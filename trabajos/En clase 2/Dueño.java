package empresa;

import java.util.Scanner;

public class Dueño implements mails {
	Scanner entrada = new Scanner(System.in);
	String nombre;
	int cedula;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public Dueño(String nombre, int cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public void mail() {
		System.out.println("cual es la ci de el destinatario");
		int destinatario = entrada.nextInt();
		if (destinatario == 509875673) {

			String mensaje;
			System.out.println("que desea ingresar");
			mensaje = entrada.next();
			System.out.println("el mensaje es " + mensaje);
		} else {
			System.out.println("usted no puede enviarle el mail");
		}
	}
}
