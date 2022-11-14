import java.util.Scanner;

/**
*
*	Ejercicio 3, Conversor de pesetas a euros, las pesetas se introducen por teclado,
* utilizando la clase Scanner.
* 
*	Nombre del archivo: Ejercicio3Scanner.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio3Scanner {
	public static void main(String[] args) {
		
		//Definimos la clase Scanner.
		Scanner s = new Scanner(System.in);
		
		//Asignamos el valor de 1 euro por peseta.
		double euros = 0.016;
		
		System.out.println("********************************");
		System.out.println("* Conversor de Pesetas a Euros *");
		System.out.println("********************************");
		
		//Pedimos al usuario que introduzca el dato.
		System.out.print("Introduzca la cantidad de Pesetas que desea cambiar: ");
		int pesetas = s.nextInt();
		
		//Definimos la operación en la variable "conversor".
		double conversor =  pesetas * euros;
		
		System.out.println("Las '" + pesetas + "' pesetas son '" + conversor + "' euros.");
		
	}
}

