package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		System.out.println("Introduce un texto");
		String texto = p.nextLine();
		do {
			System.out.println(texto.substring(0,5));
			texto = texto.substring(5);
			
		} while (texto.length() >4);
		System.out.println(texto);
		

		
		
		
		p.close();
	}

}
