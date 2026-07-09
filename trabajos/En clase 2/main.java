package empresa;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Dueño carlos = new Dueño("jose", 50987663);
		Encargado darian = new Encargado("agustin", 509875673);
		Empleado juan = new Empleado("agustina", 509234663);
		int opcion;
		do {
			System.out.println("ingrese la opcion");
			System.out.println("si enviar un mail ingrese 1");
			System.out.println("si desea salir ingrese 2");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("que cargo tienes");
				System.out.println("1- Dueño");
				System.out.println("2- Encargado");
				System.out.println("3- Empleado");
				int cargo = entrada.nextInt();
				switch (cargo) {
				case 1: {
					carlos.mail();
					break;
				}
				case 2: {
					darian.mail();
					break;
				}
				case 3: {
					juan.mail();
					break;
				}
				default:

				}
				break;
			}
			case 2:{
				System.out.println("adios");
				break;
			}
			default:
				System.out.println("opcion incorrecta");
			}
		} while (opcion != 2);
	}

}
