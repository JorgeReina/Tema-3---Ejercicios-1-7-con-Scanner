import java.util.Scanner;

/**
*
*	Ejercicio 1, Pide dos numeros por teclado y muestra el resultado de su multiplicación,
* utilizando la clase Scanner.
* 
*	Nombre del archivo: Ejercicio1Scanner.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio1Scanner {
	public static void main(String[] args) {
		
		//Definimos la clase.
		Scanner s = new Scanner(System.in);
		
		//Utilizamos "s.nexInt()" para leer un número entero.
		System.out.print("Por favor, introduce un número: ");
		int primerNumero = s.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = s.nextInt();
		
		//Variable que calcula la operación.
		int mult = primerNumero * segundoNumero;
		
		System.out.println("El resultado de '" + primerNumero + "' multiplicado por '" + segundoNumero + "' es: " + mult);	
		
	}
}
