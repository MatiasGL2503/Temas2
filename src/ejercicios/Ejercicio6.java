package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime tu nombre ");
		String nom = p.nextLine();
		Integer num = 1;
		Integer suma = 0;
		do {
			suma = num + suma;
			System.out.println("Mi nombre es " + nom + ". Linea " + suma);
		} while (suma <5);
		
		
p.close();
	}

}
