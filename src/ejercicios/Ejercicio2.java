package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("¿Cual es tu altura?");
		Double altura = p.nextDouble();
		System.out.println("¿Cual es tu peso?");
		Double peso = p.nextDouble();
		Double imc = peso / (altura + altura);
		System.out.println("Su IMC sera de " + imc);
		if (imc <= 18.5) {
			System.out.println("Tu IMC es menor al normal ");
		}
		else if (imc <=24.9) {
			System.out.println("Tu IMC es normal");
		}
		else if (imc <=29.9) {
			System.out.println("Tu IMC es superior al normal");
		}
		else if (imc >=30.0) {
			System.out.println("Obesidad");
		}
		
p.close();
	}

}



	