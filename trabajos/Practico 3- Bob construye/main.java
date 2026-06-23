package practico;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Casa cas[] = new Casa[10];
		Apartamento apa[] = new Apartamento[10];
		altaCasa(cas);
		altaApartamento(apa);
		listado(cas, apa);
	}

	public static void altaCasa(Casa[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese numero de pisos");
		System.out.println("ingrese nombre");
		System.out.println("ingrese numero de edificio");
		System.out.println("ingrese numero de solar");
		System.out.println("ingrese numero de habitaciones");
		int numpi = entrada.nextInt();
		String nom = entrada.next();
		int edi = entrada.nextInt();
		int sol = entrada.nextInt();
		int hab = entrada.nextInt();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new Casa(numpi, nom, edi, sol, hab);
				break;
			}
		}

	}

	public static void altaApartamento(Apartamento[] ar) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese numero de pisos");
		System.out.println("ingrese nombre");
		System.out.println("ingrese numero de edificio");
		System.out.println("ingrese gastos comunes");
		System.out.println("ingrese ubicacion");
		int numpi = entrada.nextInt();
		String nom = entrada.next();
		int edi = entrada.nextInt();
		int gas = entrada.nextInt();
		String ubi = entrada.next();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] != null) {
			} else {
				ar[i] = new Apartamento(numpi, nom, edi, gas, ubi);
				break;
			}
		}

	}

	public static void listado(Casa[] c, Apartamento[] a) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				System.out.println(c[i]);
			}
			if (a[i] != null) {
				System.out.println(a[i]);
			}
		}
	}
}
