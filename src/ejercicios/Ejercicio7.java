package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		Integer num1;
		Integer num2;
		
		do { // El "do" pregunta lo que le quieres pedir
		System.out.println("Dame un numero");
		num1 = p.nextInt();
		System.out.println("Dame otro numero");
		num2 = p.nextInt();
		} while (num1 != num2); // El "while" te lo repite hasta que te de lo que te pide
		
		System.out.println("Un saludo");
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		p.close();
		
		
		}

}
