package practico;

import java.util.Scanner;

public class Gestor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		libro lib[] = new libro[10];
		Revista rev[] = new Revista[10];
		ArticuloCientifico art[] = new ArticuloCientifico[10];
		altaLibro(lib);
		altaRevista(rev);
		altaArticuloCientifico(art);
		listado(lib, rev, art);
	}

	public static void altaLibro(libro[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese fecha");
		System.out.println("ingrese nombre");
		System.out.println("ingrese autor");
		System.out.println("ingrese nro de paginas");
		System.out.println("ingrese tipo de tapa");
		String fec = entrada.next();
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
		String fec = entrada.next();
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
		String fec = entrada.next();
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
}
