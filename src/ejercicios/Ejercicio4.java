package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		Integer num;
		Integer suma = 0;
		
		do {
			System.out.println("Dame un numero ");
			num = p.nextInt();
			suma =  suma + num;
			
		} while (num != 0);
		
		System.out.println("El resultado de la suma es " + suma);
		
		
		
		
			
		
		

		p.close();
		

	}

}
