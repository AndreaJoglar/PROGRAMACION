package Ficheros;

import java.util.Scanner;

public class Ejercicio03b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Calcular el área y la circunferencia
		 * de un circulo cuyo radio se debe preguntar al usuario
		 */
		/* radio = double
		 * leemos el radio
		 * area de una circunferencia = Pi * (r * r)
		 * perimetro = 2 * Pi * r
		 * Si el radio es positivo, bien
		 * sino, mensaje de error
		 */
		double radio;
		System.out.println("Introduce el radio: ");
		radio = teclado.nextDouble(); // al meter el valor por pantalla con decimales hay que usar comas para que lo lea Scanner
		
		if (radio >= 0) {
			//valores correctosç
			double area = Math.PI * (radio * radio);
			double perimetro = 2 * Math.PI * radio;
			System.out.println("Area: "+area);
			System.out.println("Perimetro: "+perimetro);
		}
		else {
			System.out.println("ERROR radio negativo");
		}

	}

}