package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		String palabra1;
		String palabra2;
		do {
			System.out.println("Dime una palabra ");
			palabra1 = p.nextLine();

			System.out.println("Dime otra palabra ");
			palabra2 = p.nextLine();

		} while (palabra1.isBlank() || palabra2.isBlank());

		Integer comparacion = palabra1.compareTo(palabra2);

		if (comparacion < 0) {
			System.out.println(palabra1 + " esta posicionada antes en orden alfabetico que la palabra " + palabra2);
		} else if (comparacion > 0) {
			System.out.println(palabra2 + " esta posicionada antes en orden alfabetico que la palabra " + palabra1);
		} else {
			System.out.println("Las palabras estan colocada en la misma posicion");
		}

		p.close();

	}

}
