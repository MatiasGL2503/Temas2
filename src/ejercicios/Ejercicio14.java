package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		System.out.println("Dame un numero entero");
		Integer num = p.nextInt();

		Integer contador = 0;

		while (contador <= 10) {
			Integer resultado = num * contador;
			System.out.println(num + "X" + contador + "=" + resultado);
			contador = contador + 1;

		}
		p.close();

	}

}
