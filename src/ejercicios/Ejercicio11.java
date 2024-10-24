package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		String email, posicion;
		Integer arroba;
		do {
			System.out.println("Dime tu email");
			email = p.nextLine();
			arroba = email.lastIndexOf("@");
			posicion = email.substring(arroba + 1);
			if (!posicion.contains("."))
				System.out.println("Tiene que acabar en . algo");
			if (!email.contains("@"))
				System.out.println("El correo debe contener una @ ");
			if (email.contains("@."))
				System.out.println("El correo no puede tener un punto despues de la @");
			if (email.endsWith("."))
				System.out.println("El correo no puede acabar con un punto (.)");

		} while (!email.contains("@") || email.contains("@.") || email.endsWith(".") || !posicion.contains("."));
		System.out.println("Correo introducido correctamente");

		p.close();

	}

}
