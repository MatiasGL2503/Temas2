package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime tu nombre completo");
		String nom = p.nextLine();
		
		Integer nom1 = nom.indexOf(" ");
		Integer nom2 = nom.lastIndexOf(" ");
		
		String nombre = nom.substring(0,nom1);
		String nombre2 = nom.substring(nom1 +1,nom2);
		String nombre3 = nom.substring(nom2 +1);
		
		System.out.println("Tu nombre es " + nombre + "\nTu primer apellido es " + nombre2 + "\nTu segundo apellido es " + nombre3);
		
		
		p.close();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
