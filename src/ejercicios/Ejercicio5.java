package ejercicios;


public class Ejercicio5 {

	public static void main(String[] args) {
		
		Integer suma = 0;
		Integer num = 1;
		while(num <= 10000) {
			if (num < 10000) {
				System.out.print(num + " + ");
			}
			else {
				System.out.print(num);
			}
			
			num++; // num = num + 1;
		}
		
	}
}
