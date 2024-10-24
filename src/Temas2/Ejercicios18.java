package Temas2;

import java.util.Scanner;

public class Ejercicios18 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		Integer tam = 5;

		for (Integer numero = 1; numero <= tam; numero++) {

			for (Integer numero2 = 1; numero2 <= tam; numero2++) {
				System.out.print(numero2 + " ");
			}
			System.out.println();
		}
		p.close();
	}
}
