import java.util.Scanner;

/**
*
*	Ejercicio 1, Pide dos numeros por teclado y muestra el resultado de su multiplicación.
* 
*	Nombre del archivo: Ejercicio1.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio1Scanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduce un número: ");
		int primerNumero = s.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = s.nextInt();
		
		int mult = primerNumero * segundoNumero;
		
		System.out.println("El resultado de '" + primerNumero + "' multiplicado por '" + segundoNumero + "' es: " + mult);	
		
	}
}
