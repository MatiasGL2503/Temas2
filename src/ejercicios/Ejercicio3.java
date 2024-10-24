package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("¿Cual es el precio sin IVA de este articulo? ");
		Double precio = p.nextDouble();
		p.nextLine();
		System.out.println("¿Que tipo de IVA quieres?");
		String tipoIva = p.nextLine();
		
		Boolean hayError = true; {
		Double precioConIva = precio * 0.21 + precio;
		Double ivaReducido = precio * 0.10 + precio;
		Double ivaSreducido = precio * 0.04 + precio;
		Double ivaExcento = precio * 0.00 + precio;
		
		if (tipoIva.equalsIgnoreCase("Normal")) { // Si cambias equals por equalsIgnoreCase, lee tanto mayusculas como minusculas
			System.out.println("El resultado con Iva normal es de " + precioConIva);
		}
		else if (tipoIva.equalsIgnoreCase("Reducido")) {
			System.out.println("El resultado con Iva reducido es de " + ivaReducido);
		}
		else if (tipoIva.equalsIgnoreCase("Super reducido")) {
			System.out.println("El resultado con Iva super reducido es " + ivaSreducido);
		}
		else if (tipoIva.equalsIgnoreCase("Excento")) {
			System.out.println("El resultado con Iva excento es " + ivaExcento);
		}
		else {
			System.out.println("El tipo de Iva indicado es incorrecto");
			hayError = false; 
		}
		if (hayError == true) {
		
		System.out.println("Resultado con IVA  " + precioConIva + "\n y sin IVA " + precio);
		}
		}
		p.close();
		
		
		}
	}



