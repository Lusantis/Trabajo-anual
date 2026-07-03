package practico;

import java.util.Scanner;

public class Gestor {
	public static void main(String[] args) {
		int opcion;
		Scanner entrada = new Scanner(System.in);
		libro lib[] = new libro[10];
		Revista rev[] = new Revista[10];
		ArticuloCientifico art[] = new ArticuloCientifico[10];
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
				System.out.println("1- Libro");
				System.out.println("2- Revista");
				System.out.println("3- Articulo Cientifico");
				alta = entrada.nextInt();
				switch (alta) {
				case 1: {
					altaLibro(lib);
				}
					break;
				case 2: {
					altaRevista(rev);
				}
					break;
				case 3: {
					altaArticuloCientifico(art);
				}
					break;
				default: {
					System.out.println("numero equivocado");
				}
				}

			}
				break;
			case 2: {
				listado(lib, rev, art);
			}
				break;
			case 3: {
				baja(lib, rev, art);

			}
				break;
			case 4: {
				Modificacion(lib, rev, art);

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

	public static void altaLibro(libro[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese fecha");
		System.out.println("ingrese nombre");
		System.out.println("ingrese autor");
		System.out.println("ingrese nro de paginas");
		System.out.println("ingrese tipo de tapa");
		int fec = entrada.nextInt();
		String nom = entrada.next();
		String aut = entrada.next();
		int nro = entrada.nextInt();
		String tapa = entrada.next();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new libro(fec, nom, aut, nro, tapa);
				break;
			}
		}

	}

	public static void altaRevista(Revista[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese fecha");
		System.out.println("ingrese nombre");
		System.out.println("ingrese autor");
		System.out.println("ingrese idioma");
		System.out.println("ingrese editorial");
		int fec = entrada.nextInt();
		String nom = entrada.next();
		String aut = entrada.next();
		String idi = entrada.next();
		String edi = entrada.next();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new Revista(fec, nom, aut, idi, edi);
				break;
			}
		}

	}

	public static void altaArticuloCientifico(ArticuloCientifico[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese fecha");
		System.out.println("ingrese nombre");
		System.out.println("ingrese autor");
		System.out.println("ingrese oritentacion");
		System.out.println("ingrese tema");
		int fec = entrada.nextInt();
		String nom = entrada.next();
		String aut = entrada.next();
		String ori = entrada.next();
		String tem = entrada.next();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new ArticuloCientifico(fec, nom, aut, ori, tem);
				break;
			}
		}

	}

	public static void listado(libro[] l, Revista[] r, ArticuloCientifico[] a) {
		for (int i = 0; i < l.length; i++) {
			if (l[i] != null) {

				System.out.println("Libro");
				System.out.println(l[i]);
			}
			if (r[i] != null) {
				System.out.println("Revista");
				System.out.println(r[i]);
			}
			if (a[i] != null) {
				System.out.println("Articulo Cientifico");
				System.out.println(a[i]);
			}
		}
	}

	public static void baja(libro[] l, Revista[] r, ArticuloCientifico[] a) {
		Scanner entrada = new Scanner(System.in);
		int fecha;
		for (int i = 0; i < l.length; i++) {
			if (l[i] != null) {

				System.out.println("libro");
				System.out.println(l[i]);
			}
			if (r[i] != null) {
				System.out.println("Revista");
				System.out.println(r[i]);
			}
			if (a[i] != null) {
				System.out.println("Articulo cientifico");
				System.out.println(a[i]);
			}
		}

		System.out.println("ingrese la fecha");
		fecha = entrada.nextInt();
		for (int i = 0; i < l.length; i++) {
			if ((l[i] != null) || (r[i] != null) || (a[i] != null)) {
				if (fecha == l[i].getFecha()) {
					System.out.println("si desea eliminar la fecha ingrese 1");
					System.out.println("si desea eliminar el nombre infrese 2");
					System.out.println("si desea eliminar el autor ingrese 3");
					System.out.println("si desea eliminar el nro de paginas ingrese 4");
					System.out.println("si desea eliminar el tipo de tapa ingrese 5");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						l[i].setFecha(0);
					}
					if (opcion == 2) {
						l[i].setNombre(null);
					}
					if (opcion == 3) {
						l[i].setAutor(null);
					}
					if (opcion == 4) {
						l[i].setNropaginas(0);
					}
					if (opcion == 5) {
						l[i].setTipoTapa(null);
					}
					break;
				}
				if (fecha == r[i].getFecha()) {
					System.out.println("si desea eliminar la fecha ingrese 1");
					System.out.println("si desea eliminar el nombre infrese 2");
					System.out.println("si desea eliminar el autor ingrese 3");
					System.out.println("si desea eliminar el idioma ingrese 4");
					System.out.println("si desea eliminar la editorial ingrese 5");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						r[i].setFecha(0);
					}
					if (opcion == 2) {
						r[i].setNombre(null);
					}
					if (opcion == 3) {
						r[i].setAutor(null);
					}
					if (opcion == 4) {
						r[i].setIdioma(null);
					}
					if (opcion == 5) {
						r[i].setEditorial(null);
					}
					break;
				}
				if (fecha == a[i].getFecha()) {
					System.out.println("si desea eliminar la fecha ingrese 1");
					System.out.println("si desea eliminar el nombre infrese 2");
					System.out.println("si desea eliminar el autor ingrese 3");
					System.out.println("si desea eliminar la tela ingrese 4");
					System.out.println("si desea eliminar la estacion ingrese 5");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						a[i].setFecha(0);
					}
					if (opcion == 2) {
						a[i].setNombre(null);
					}
					if (opcion == 3) {
						a[i].setAutor(null);
					}
					if (opcion == 4) {
						a[i].setOrientacion(null);
					}
					if (opcion == 5) {
						a[i].setTema(null);
					}
					break;
				}

			}
		}
	}

	public static void Modificacion(libro[] l, Revista[] r, ArticuloCientifico[] a) {
		Scanner entrada = new Scanner(System.in);
		int fec;
		int opcion;
		for (int i = 0; i < l.length; i++) {
			if (l[i] != null) {

				System.out.println("libro");
				System.out.println(l[i]);
			}
			if (r[i] != null) {
				System.out.println("Revista");
				System.out.println(r[i]);
			}
			if (a[i] != null) {
				System.out.println("ArticuloCientifico");
				System.out.println(a[i]);
			}
		}

		System.out.println("ingrese la fecha");
		fec = entrada.nextInt();
		for (int c = 0; c < l.length; c++) {
			if (l[c] != null) {
				if (fec == l[c].getFecha()) {
					System.out.println("si desea modificar la fecha ingrese 1");
					System.out.println("si desea modificar el nombre infrese 2");
					System.out.println("si desea modificar el Autor ingrese 3");
					System.out.println("si desea modificar el nro de paginas ingrese 4");
					System.out.println("si desea modificar el tipo de tapa ingrese 5");
					opcion = entrada.nextInt();
					if (opcion == 1) {

						System.out.println("ingrese el dato remplazante");
						int fecha = entrada.nextInt();
						l[c].setFecha(fecha);
						break;
					}

					if (opcion == 2) {
						System.out.println("ingrese el dato remplazante");
						String nombre = entrada.next();
						l[c].setNombre(nombre);
						break;
					}
					if (opcion == 3) {
						System.out.println("ingrese el dato remplazante");
						String autor = entrada.next();
						l[c].setAutor(autor);
						break;
					}
					if (opcion == 4) {

						System.out.println("ingrese el dato remplazante");
						int nropaginas = entrada.nextInt();
						l[c].setNropaginas(nropaginas);
						break;
					}
					if (opcion == 5) {

						System.out.println("ingrese el dato remplazante");
						String tipotapa = entrada.next();
						l[c].setTipoTapa(tipotapa);
						break;
					}
				}
			}
			if (r[c] != null) {
				if (fec == r[c].getFecha()) {
					System.out.println("si desea modificar la fecha ingrese 1");
					System.out.println("si desea modificar el nombre infrese 2");
					System.out.println("si desea modificar el Autor ingrese 3");
					System.out.println("si desea modificar el idioma ingrese 4");
					System.out.println("si desea modificar la editorial ingrese 5");
					opcion = entrada.nextInt();
					if (opcion == 1) {

						System.out.println("ingrese el dato remplazante");
						int fecha = entrada.nextInt();
						r[c].setFecha(fecha);
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
						String autor = entrada.next();
						r[c].setAutor(autor);
						break;
					}
					if (opcion == 4) {

						System.out.println("ingrese el dato remplazante");
						String idioma = entrada.next();
						r[c].setIdioma(idioma);
						break;
					}
					if (opcion == 5) {

						System.out.println("ingrese el dato remplazante");
						String editorial = entrada.next();
						r[c].setEditorial(editorial);
						break;
					}
				}
			}
			if (a[c] != null) {
				if (fec == r[c].getFecha()) {
					System.out.println("si desea modificar la fecha ingrese 1");
					System.out.println("si desea modificar el nombre infrese 2");
					System.out.println("si desea modificar el autor ingrese 3");
					System.out.println("si desea modificar la orientacion ingrese 4");
					System.out.println("si desea modificar la tema ingrese 5");
					opcion = entrada.nextInt();
					if (opcion == 1) {

						System.out.println("ingrese el dato remplazante");
						int fecha = entrada.nextInt();
						a[c].setFecha(fecha);
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
						String autor = entrada.next();
						a[c].setAutor(autor);
						break;
					}
					if (opcion == 4) {

						System.out.println("ingrese el dato remplazante");
						String orientacion = entrada.next();
						a[c].setOrientacion(orientacion);
						break;
					}
					if (opcion == 5) {

						System.out.println("ingrese el dato remplazante");
						String tema = entrada.next();
						a[c].setTema(tema);
						break;
					}
				}
			}

		}
	}
}
