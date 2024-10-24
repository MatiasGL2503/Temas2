package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime tu nombre ");
		String nombre = p.nextLine();

		for (Integer num = 1; num <= 5; num++) {
			Integer suma = num;
			System.out.println("Mi nombre es " + nombre + " Linea " + suma);
		}
		p.close();
	}
}

	
