import java.util.Scanner;

/**
*
*	Ejercicio 2, Conversor de euros a pesetas, los euros se introducen por teclado,
* 	utilizando la clase Scanner.
* 
*	Nombre del archivo: Ejercicio2.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio2Scanner {
	public static void main(String[] args) {
		
		//Definimos la clase.
		Scanner s = new Scanner(System.in);
		
		//Variable con el valor de las pesetas.
		int pesetas = 166;
		
		System.out.println("********************************");
		System.out.println("* Conversor de Euros a Pesetas *");
		System.out.println("********************************");
		
		//Pedimos al usuraio que itroduzca la cantidad.
		System.out.print("Introduzca la cantidad de Euros que desea cambiar: ");
		int euros = s.nextInt();
		
		//Variable que multiplica los euros por las pesetas.
		int conversor = euros * pesetas;
		
		System.out.println("Los '" + euros + "' euros son '" + conversor + "' pesetas.");
		
	}
}
