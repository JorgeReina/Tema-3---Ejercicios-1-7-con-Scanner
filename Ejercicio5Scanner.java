import java.util.Scanner;

/**
*
*	Ejercicio 5, Programa que calcula el área de un rectángulo,
* utilizando la clase Scanner.
* 
*	Nombre del archivo: Ejercicio5Scanner.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio5Scanner {
	public static void main(String[] args) {
		
		//Definimos nuestra clase.
		Scanner s = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca la altura.
		System.out.print("Introduce la altura del rectángulo: ");
		int altura = s.nextInt();
		
		//Pedimos al usuario que introduzca la base.
		System.out.print("Introduce la base del rectángulo: ");
		int base = s.nextInt();
		
		//Definimos la operación.
		int areaRectangulo = altura * base;
		
		System.out.println("El área del rectángulo es de: " + areaRectangulo + " Cm2");
		
	}
}
