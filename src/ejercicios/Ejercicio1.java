package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("¿Cual es tu año de nacimiento?");
		Integer añoNacimiento = p.nextInt();
		if (añoNacimiento >= 2010 && añoNacimiento <= 2020) {
			System.out.println("Perteneces a la generación Alfa");
		}
		else if (añoNacimiento >= 1997 && añoNacimiento <= 2012) {
			System.out.println("Pertecenes a la generación Z");
		}
		else if (añoNacimiento >= 1981 && añoNacimiento <= 1996) {
			System.out.println("Perteneces a la generación Milennials");
		}
		else if (añoNacimiento >= 1965 && añoNacimiento <= 1980) {
			System.out.println("Perteneces a la generación X");
		}
		else if (añoNacimiento >= 1946 && añoNacimiento <= 1964) {
			System.out.println("Pertecenes a la generación Boomers");
		}
		else if (añoNacimiento >= 1928 && añoNacimiento <= 1945) {
			System.out.println("Perteneces a la generación Silenciosa");
		}
		else {
			System.out.println("El año indicado no es correcto");
		}
		p.close();
		
		
		
		
		
		
		
		
		p.close();

	}

}
