package ficheros2_1;

import java.util.Scanner;

public class Ejercicio05Piramide {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* hacer pirámide asteriscos
		 * altura de la pirámide pedida a usuario
		 */
		
		System.out.println("Escribe un número: ");
		int altura = teclado.nextInt();
		
		for (int cantidadFilas = 1; cantidadFilas <= altura; cantidadFilas++) {
			System.out.println();
			for (int espacio = 1; espacio <= altura - cantidadFilas; espacio++) {
				System.out.print(" ");
			}
			for (int asteriscos = 1; asteriscos <= (cantidadFilas * 2) - 1; asteriscos++) {
				System.out.print("*");
			}
		}

	}

}