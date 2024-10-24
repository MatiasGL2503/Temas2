package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		String palabra1;
		String palabra2;
		
		
		do {
			System.out.println("palabra 1");
			palabra1 = p.nextLine();
			System.out.println("palabra 2");
			palabra2 = p.nextLine();
			palabra1 = palabra1.trim();
			palabra2 = palabra2.trim();
			
		}while (!palabra1.equalsIgnoreCase(palabra2) );
		
		System.out.println("Un saludo");

		
		p.close();
	}

}
