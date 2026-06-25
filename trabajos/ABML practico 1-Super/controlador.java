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
			System.out.println("3- Baja Profucto");
			System.out.println("4-Modificacion Producto");
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
				baja(ele, rop, ali);

			}
				break;
			case 4: {
				Modificacion(ele, rop, ali);

			}
				break;
			case 5: {
				System.out.println("Gracias por usar el software");
			}
				break;
			default:
				System.out.println("numero equivocado");
			}
		} while (opcion != 5);
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

	public static void baja(Electronica[] e, ropa[] r, Alimento[] a) {
		Scanner entrada = new Scanner(System.in);
		int codbarra;
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

		System.out.println("ingrese el codigo de barra");
		codbarra = entrada.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				if (codbarra == a[i].getCodBarra()) {
					System.out.println("si desea eliminar el codbarra ingrese 1");
					System.out.println("si desea eliminar el nombre infrese 2");
					System.out.println("si desea eliminar el precio ingrese 3");
					System.out.println("si desea eliminar el tipo ingrese 4");
					System.out.println("si desea eliminar el origen ingrese 5");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						a[i].setCodBarra(0);
					}
					if (opcion == 2) {
						a[i].setNombre(null);
					}
					if (opcion == 3) {
						a[i].setPrecio(0);
					}
					if (opcion == 4) {
						a[i].setTipo(null);
					}
					if (opcion == 5) {
						a[i].setOrigen(null);
					}
				}
				if (codbarra == e[i].getCodBarra()) {
					System.out.println("si desea eliminar el codbarra ingrese 1");
					System.out.println("si desea eliminar el nombre infrese 2");
					System.out.println("si desea eliminar el precio ingrese 3");
					System.out.println("si desea eliminar la marca ingrese 4");
					System.out.println("si desea eliminar el modelo ingrese 5");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						e[i].setCodBarra(0);
					}
					if (opcion == 2) {
						e[i].setNombre(null);
					}
					if (opcion == 3) {
						e[i].setPrecio(0);
					}
					if (opcion == 4) {
						e[i].setMarca(null);
					}
					if (opcion == 5) {
						e[i].setModelo(null);
					}
				}
				if (codbarra == r[i].getCodBarra()) {
					System.out.println("si desea eliminar el codbarra ingrese 1");
					System.out.println("si desea eliminar el nombre infrese 2");
					System.out.println("si desea eliminar el precio ingrese 3");
					System.out.println("si desea eliminar la tela ingrese 4");
					System.out.println("si desea eliminar la estacion ingrese 5");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						r[i].setCodBarra(0);
					}
					if (opcion == 2) {
						r[i].setNombre(null);
					}
					if (opcion == 3) {
						r[i].setPrecio(0);
					}
					if (opcion == 4) {
						r[i].setTela(null);
					}
					if (opcion == 5) {
						r[i].setEstacion(null);
					}
				}

			}
		}
	}

	public static void Modificacion(Electronica[] e, ropa[] r, Alimento[] a) {
		Scanner entrada = new Scanner(System.in);
		int codbarra;
		int opcion;
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

		System.out.println("ingrese el codbarra");
		codbarra = entrada.nextInt();
		for (int c = 0; c < a.length; c++) {
			if (a[c] != null) {
				if (codbarra == a[c].getCodBarra()) {
					System.out.println("si desea modificar el codbarra ingrese 1");
					System.out.println("si desea modificar el nombre infrese 2");
					System.out.println("si desea modificar el precio ingrese 3");
					System.out.println("si desea modificar el tipo ingrese 4");
					System.out.println("si desea modificar el origen ingrese 5");
					opcion = entrada.nextInt();
					if (opcion == 1) {

						System.out.println("ingrese el dato remplazante");
						int Codbar = entrada.nextInt();
						a[c].setCodBarra(Codbar);
						break;
					}

					if (opcion == 2) {
						System.out.println("ingrese el dato remplazante");
						String nombre = entrada.next();
						a[c].setNombre(nombre);
						break;
					}
					if (opcion == 3) {
						System.out.println("ingrese el dato remplazante");
						double precio = entrada.nextDouble();
						a[c].setPrecio(precio);
						break;
					}
					if (opcion == 4) {

						System.out.println("ingrese el dato remplazante");
						String tipo = entrada.next();
						a[c].setTipo(tipo);
						break;
					}
					if (opcion == 5) {

						System.out.println("ingrese el dato remplazante");
						String origen = entrada.next();
						a[c].setOrigen(origen);
						break;
					}
				}
			}
			if (e[c] != null) {
				if (codbarra == e[c].getCodBarra()) {
					System.out.println("si desea modificar el codbarra ingrese 1");
					System.out.println("si desea modificar el nombre infrese 2");
					System.out.println("si desea modificar el precio ingrese 3");
					System.out.println("si desea modificar la marca ingrese 4");
					System.out.println("si desea modificar el modelo ingrese 5");
					opcion = entrada.nextInt();
					if (opcion == 1) {

						System.out.println("ingrese el dato remplazante");
						int Codbar = entrada.nextInt();
						e[c].setCodBarra(Codbar);
						break;
					}

					if (opcion == 2) {
						System.out.println("ingrese el dato remplazante");
						String nombre = entrada.next();
						e[c].setNombre(nombre);
						break;
					}
					if (opcion == 3) {
						System.out.println("ingrese el dato remplazante");
						double precio = entrada.nextDouble();
						e[c].setPrecio(precio);
						break;
					}
					if (opcion == 4) {

						System.out.println("ingrese el dato remplazante");
						String marca = entrada.next();
						e[c].setMarca(marca);
						break;
					}
					if (opcion == 5) {

						System.out.println("ingrese el dato remplazante");
						String modelo = entrada.next();
						e[c].setModelo(modelo);
						break;
					}
				}
			}
			if (r[c] != null) {
				if (codbarra == r[c].getCodBarra()) {
					System.out.println("si desea modificar el codbarra ingrese 1");
					System.out.println("si desea modificar el nombre infrese 2");
					System.out.println("si desea modificar el precio ingrese 3");
					System.out.println("si desea modificar la tela ingrese 4");
					System.out.println("si desea modificar la estacion ingrese 5");
					opcion = entrada.nextInt();
					if (opcion == 1) {

						System.out.println("ingrese el dato remplazante");
						int Codbar = entrada.nextInt();
						r[c].setCodBarra(Codbar);
						break;
					}

					if (opcion == 2) {
						System.out.println("ingrese el dato remplazante");
						String nombre = entrada.next();
						r[c].setNombre(nombre);
						break;
					}
					if (opcion == 3) {
						System.out.println("ingrese el dato remplazante");
						double precio = entrada.nextDouble();
						r[c].setPrecio(precio);
						break;
					}
					if (opcion == 4) {

						System.out.println("ingrese el dato remplazante");
						String tela = entrada.next();
						r[c].setTela(tela);
						break;
					}
					if (opcion == 5) {

						System.out.println("ingrese el dato remplazante");
						String estacion = entrada.next();
						r[c].setEstacion(estacion);
						break;
					}
				}
			}

		}
	}
}