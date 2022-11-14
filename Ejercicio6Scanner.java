import java.util.Scanner;

/**
*
*	Ejercicio 6, Programa que calcula el área de un triangulo,
* utilizando la clase Scanner.
* 
*	Nombre del archivo: Ejercicio6Scanner.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio6Scanner {
	public static void main(String[] args) {
		
		//Definimos nuestra clase.
		Scanner s = new Scanner(System.in);
		
		//Pedimos que el usuario introduzca la altura.
		System.out.print("Introduce la altura del triangulo: ");
		int altura = s.nextInt();
		
		//Pedimos al usuario que introduzca la base.
		System.out.print("Introduce la base del triangulo: ");
		int base = s.nextInt();
		
		//Definimos la formula del area del triangulo.
		double areaTriangulo = ((double)altura * (double)base) / 2;
		
		System.out.println("El área del triangulo es de: " + areaTriangulo + " Cm2");
		
	}
}
