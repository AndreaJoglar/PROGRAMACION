package Ficheros_Vectores;

import java.util.Scanner;

public class ejercicio07 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float [] v = {6,3,4,8,5,7,9,2,1};
		Libreria.mostrarVectorReal(v);
		System.out.println("Vector ordenado: ");
		Libreria.ordenarParesImpares(v);
		Libreria.mostrarVectorReal(v);
		
	}

}