package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
	

		Scanner p = new Scanner(System.in);

		Integer numero = 9;

		for (int num = 1; num <= numero; num++) {

			for (int num2 = 1; num2 <= num; num2++) {
				System.out.print(num2 + " ");
			}

			System.out.println();
			p.close();
		}
	}

}


