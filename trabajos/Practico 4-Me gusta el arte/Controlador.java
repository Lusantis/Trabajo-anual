package arreglos;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pintura pin[] = new Pintura[10];
		Escultura esc[] = new Escultura[10];
		Foto fot[] = new Foto[10];
		altaPintura(pin);
		altaEscultura(esc);
		altaFoto(fot);
		listado(pin, esc, fot);
	}

	public static void altaPintura(Pintura[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese numero obra");
		System.out.println("ingrese autor");
		System.out.println("ingrese nombre");
		System.out.println("ingrese tipo");
		System.out.println("ingrese valor");
		int idob = entrada.nextInt();
		String aut = entrada.next();
		String nom = entrada.next();
		String tip = entrada.next();
		int val = entrada.nextInt();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new Pintura(idob, aut, nom, tip, val);
				break;
			}
		}

	}

	public static void altaEscultura(Escultura[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese numero obra");
		System.out.println("ingrese autor");
		System.out.println("ingrese nombre");
		System.out.println("ingrese material");
		System.out.println("ingrese tamaño");
		int idob = entrada.nextInt();
		String aut = entrada.next();
		String nom = entrada.next();
		String mat = entrada.next();
		double tam = entrada.nextDouble();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new Escultura(idob, aut, nom, mat, tam);
				break;
			}
		}

	}

	public static void altaFoto(Foto[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese numero obra");
		System.out.println("ingrese autor");
		System.out.println("ingrese nombre");
		System.out.println("ingrese fecha");
		System.out.println("ingrese filtro");
		int idob = entrada.nextInt();
		String aut = entrada.next();
		String nom = entrada.next();
		String fec = entrada.next();
		String fil = entrada.next();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new Foto(idob, aut, nom, fec, fil);
				break;
			}
		}

	}

	public static void listado(Pintura[] p, Escultura[] e, Foto[] f) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] != null) {
				System.out.println(p[i]);
			}
			if (e[i] != null) {
				System.out.println(e[i]);
			}
			if (f[i] != null) {
				System.out.println(f[i]);
			}
		}
	}

}
