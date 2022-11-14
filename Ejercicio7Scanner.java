import java.util.Scanner;

/**
*
*	Ejercicio 7, Programa que calcula el total de una factura a partir de la base imponible,
* utilizando la clase Scanner.
* 
*	Nombre del archivo: Ejercicio7Scanner.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio7Scanner {
	public static void main(String[] args) {
		
		//Definimos nuestra clase.
		Scanner s = new Scanner(System.in);
		
		//Pedimos al usaurio que introduzca los datos.
		System.out.print("Introduce la base imponible: ");
		int base = s.nextInt();
		
		//Definimos nuestra fórmula.
		double iva = (double)base * 1.21;
		
		System.out.println("El total de la factura con I.V.A. es de: " + iva + " Euros"); 
		
	}
}
