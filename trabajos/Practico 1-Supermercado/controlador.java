package practico;

import java.util.Scanner;

public class controlador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Electronica ele[] = new Electronica[10];
		ropa rop[] = new ropa[10];
		Alimento ali[] = new Alimento[10];
		int bar = 0;
		String nom = null;
		double pre = 0;
		int opcion;
		do {
			System.out.println("bienvenido al controlador");
			System.out.println("1- Alta Producto");
			System.out.println("2- Listado de los Productos");
			System.out.println("ingrese una opcion");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1: {
				int alta;
				System.out.println("que tipo de producto desea ingresar");
				System.out.println("1- Electronica");
				System.out.println("2- Ropa");
				System.out.println("3- Alimento");
				alta = entrada.nextInt();
				switch (alta) {
				case 1: {
					String marca = null;
					String modelo = null;
					System.out.println("ingrese codigo de barra");
					bar = entrada.nextInt();
					System.out.println("ingrese nombre");
					nom = entrada.next();
					System.out.println("ingrese precio");
					pre = entrada.nextDouble();
					System.out.println("ingrese marca");
					marca = entrada.next();
					System.out.println("ingrese modelo");
					modelo = entrada.next();
					altaElectronica(ele, bar, nom, pre, marca, modelo);
				}
					break;
				case 2: {
					String tela;
					String estacion;
					System.out.println("ingrese codigo de barra");
					bar = entrada.nextInt();
					System.out.println("ingrese nombre");
					nom = entrada.next();
					System.out.println("ingrese precio");
					pre = entrada.nextDouble();
					System.out.println("ingrese tela");
					tela = entrada.next();
					System.out.println("ingrese estacion");
					estacion = entrada.next();
					altaRopa(rop, bar, nom, pre, tela, estacion);
				}
					break;
				case 3: {
					String tipo;
					String origen;
					System.out.println("ingrese codigo de barra");
					bar = entrada.nextInt();
					System.out.println("ingrese nombre");
					nom = entrada.next();
					System.out.println("ingrese precio");
					pre = entrada.nextDouble();
					System.out.println("ingrese tipo");
					tipo = entrada.next();
					System.out.println("ingrese origen");
					origen = entrada.next();
					altaAlimento(ali, bar, nom, pre, tipo, origen);
				}
					break;
				default: {
					System.out.println("numero equivocado");
				}
				}

			}
				break;
			case 2: {
				listaProductos(ele, rop, ali);
			}
				break;
			case 3: {
				System.out.println("Gracias por usar el software");
			}
				break;
			default:
				System.out.println("numero equivocado");
			}
		} while (opcion != 3);
		{

		}
	}

	public static void altaElectronica(Electronica ar[], int bar, String nom, double pre, String mar, String mod) {
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new Electronica(bar, nom, pre, mar, mod);
				break;
			}
		}
	}

	public static void altaRopa(ropa ar[], int bar, String nom, double pre, String tel, String est) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
			} else {
				ar[i] = new ropa(bar, nom, pre, tel, est);
				break;
			}
		}
	}

	public static void altaAlimento(Alimento ar[], int bar, String nom, double pre, String tip, String ori) {
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new Alimento(bar, nom, pre, tip, ori);
				break;
			}
		}
	}

	public static void listaProductos(Electronica e[], ropa r[], Alimento a[]) {
		for (int i = 0; i < a.length; i++) {
			if (e[i] != null) {

				System.out.println("Electronica");
				System.out.println(e[i]);
			}
			if (r[i] != null) {
				System.out.println("Ropa");
				System.out.println(r[i]);
			}
			if (a[i] != null) {
				System.out.println("Alimento");
				System.out.println(a[i]);
			}
		}
	}
}
