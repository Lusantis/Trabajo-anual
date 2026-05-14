package sd;

public class gestor {

	public static void main(String[] args) {
		Auto auto1 = new Auto(1243512, 3245221, "toyota", "prius", 5, "hatchback");
		birrodados moto1 = new birrodados(12334412, 452156342, "suzuki", "azul", "deportiva", 2010);
		alumno alumno1 = new alumno("Santiago", "Lubenko", 23566613, 20, 9, "exelente alumno");
		profesor profesor1 = new profesor("Ramiro", "Sosa", 54367324, 16, "informatica", 20000);
		triangulo triangulo1 = new triangulo(10, 12, 4, "equilatero", 12, 5);
		circulo circulo1 = new circulo(10, 12, 4, 4, "0;2", 12);
		System.out.println("el modelo del coche es " + auto1.getModelo());
		System.out.println("el año de la moto es " + moto1.getAño());
		System.out.println("la calificacion del alumno es " + alumno1.getCalificacion());
		System.out.println("el sueldo del profesor es " + profesor1.getSueldo());
		System.out.println("el tipo  del triangulo es " + triangulo1.getTipoTriangulo());
		System.out.println("el punto central del circulo es " + circulo1.getCentroCirculo());

	}

}
