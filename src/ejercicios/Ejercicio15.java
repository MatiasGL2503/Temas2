package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("dame un numero entero");
		Integer numero = p.nextInt();
		for (Integer contador = 0; contador <= 10; contador++) {
			Integer resultado = numero * contador;
			System.out.println(numero + "X" + contador + "=" + resultado );
		}
		
		p.close();
	}

}
