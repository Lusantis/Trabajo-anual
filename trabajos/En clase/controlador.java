package interfaz;

import java.util.Scanner;

public class controlador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		Dinosaurio dino = new Dinosaurio("jose", 200);
		Perro perro = new Perro("copo", 6);
		int opcion;
		do {
			System.out.println("ingrese una opcion");
			System.out.println("1-comer dino");
			System.out.println("2-dormir dino");
			System.out.println("3-comer perro");
			System.out.println("4-dormir perro");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1: {
				dino.comer();
				break;
			}
			case 2: {
				dino.dormir();
				break;
			}
			case 3: {
				perro.comer();
				break;
			}
			case 4: {
				perro.dormir();
				break;
			}
			case 5: {
				System.out.println("adios");
			}
			default:
				System.out.println("opcion invalida");
			}
		} while (opcion != 5);
	}

}
