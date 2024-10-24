package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		do {
			System.out.println("Indica el username:");
			username = sc.nextLine().trim().toUpperCase();
			// se puede hacer en dos líneas separadas también
			//username = username.trim();
			//username = username.toUpperCase();
			if (username.length()<10) {
				System.out.println("El username tiene que tener una longitud de 10 caracteres al menos");
			}
			if (username.contains(" ")) {
				System.out.println("El username no puede contener espacios");
			}
		}

		while(username.length() < 10  ||  username.contains(" "));
		
		System.out.println("Perfecto!! Tu usuario es "+ username);
		
		sc.close();


	}

}
