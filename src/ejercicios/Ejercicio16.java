package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		for (Integer numero = 0; numero <= 10000; numero++) {
			Integer suma = numero;
			System.out.print(suma + " + ");
		}
		p.close();
	}
}