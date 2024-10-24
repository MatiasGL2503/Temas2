package ejercicios;

import java.util.Scanner;

public class Ejemplowhile {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		Integer x = -1;
		
		while (x < 75) {
		System.out.println("Dame un número");
		x = p.nextInt();
		}
	}

}
