import java.util.Scanner;

/**
*
*	Ejercicio 4, Programa que suma, resta, mult y divide dos numeros ingresados por pantalla,
* utilizando la clase Scanner.
* 
*	Nombre del archivo: Ejercicio4Scanner.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio4Scanner {
	public static void main(String[] args) {
		
		//Definimos la clase Scanner.
		Scanner s = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca el 1º dato.
		System.out.print("Introduce el primer numero: ");
		int primerNumero = s.nextInt();
		
		//Y ahora que introduzca el 2º dato.
		System.out.print("Introduce el segundo numero: ");
		int segundoNumero = s.nextInt();
		
		//Definimos todas las operaciones.
		int suma = primerNumero + segundoNumero;
		int resta = primerNumero - segundoNumero;
		int mult = primerNumero * segundoNumero;
		double div = (double)primerNumero / (double)segundoNumero;
		
		System.out.println("La suma: " + suma);
		System.out.println("La resta: " + resta);
		System.out.println("La mult: " + mult);
		System.out.println("La div: " + div);
		
	}
}
