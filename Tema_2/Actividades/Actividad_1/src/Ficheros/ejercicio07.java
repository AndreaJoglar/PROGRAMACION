package Ficheros;

import java.util.Scanner;

public class ejercicio07 {
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cuando hacemos menús, mejor crear la función en el main
		int opcion = menu();
		if(opcion == 1) {
			double fahrenheit = Libreria.conversorFahrenheit();
			System.out.println("Temperatura en Fahrenheit = "+fahrenheit);
		}
		if(opcion == 2) {
			double centigrados = Libreria.conversorCentigrados();
			System.out.println("Temperatura en Fahrenheit = "+centigrados);
		}
		
	}
	private static int menu() {
		// TODO Auto-generated method stub
			System.out.println("Elige una opcion:\n1. Introduces Centígrados"+
													"\n2. Introduces Fahrenheit");
			int option = teclado.nextInt();
			while ((option != 1) && (option != 2)) {
				System.out.println("Inténtalo de nuevo:\n1. Introduces Centígrados"+
													"\n2. Introduces Fahrenheit");
				option = teclado.nextInt();
			/*	Para comprobación de errores:
			 * podemos usar la estructura do-while	
			 */
			}
			return option;
	}

}