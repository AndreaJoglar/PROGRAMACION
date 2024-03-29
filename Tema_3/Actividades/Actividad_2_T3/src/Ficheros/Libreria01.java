package Ficheros;

import java.util.Scanner;

public class Libreria01 {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Funcion que lee una matriz con valores pedidos
	 * al usuario.
	 * @param m matriz de enteros
	 */
	public static void leerMatriz (int m[][]) {
		for (int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.println("["+i+", "+j+"]");
				m[i][j]=teclado.nextInt();
			}
		}
	}
	
	/**
	 * Funcion que muestra una matriz por pantalla por filas
	 * @param m matriz de enteros
	 */
	public static void mostrarMatriz (int m [][]) {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Funcion que suma los valores de una matriz
	 * por filas.
	 * @param m matriz de enteros
	 */
	public static void sumaFilas (int m [][]) {
		//int v[]=new int [m.length]
		for (int i=0;i<m.length;i++) {
			int suma = 0;
			for (int j =0;j<m[0].length;j++) {
				suma += m[i][j];
			}
			System.out.println("["+i+"] "+suma);
			//v[i]=suma;
		}
		//return v;
	}
	
	
	/**
	 * Funcion que suma de los valores de una matriz 
	 * por columnas
	 * @param m matriz de enteros
	 */
	public static void sumaColumnas (int m [][]) {
		for (int j =0; j<m[0].length;j++) {
			int suma = 0;
			for (int i=0;i<m.length;i++) {
				suma = suma + m[i][j];	
			}
			System.out.println("["+j+"] "+suma);
		}
	}
	
	/**
	 * Funcion que devuelve una nueva matriz intercambiando
	 * filas por columnas
	 * @param m matriz de vectores
	 * @return entero
	 */
	public static int [][]  intercambia (int [][]m){
		int numFilas = m.length;
		int numColumnas = m[0].length;
		int nuevaMatriz [][]=new int [numColumnas][numFilas];
		
		for (int i=0; i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				nuevaMatriz [j][i]= m[i][j];
			}
		}
		return nuevaMatriz;	
	}
	
	/* Funcion que imprime una matriz que intercambia filas y columnas
	public static void  intercambia (int [][]m){
		for (int i=0; i<m[0].length;i++) {
			for (int j=0;j<m.length;j++) {
				System.out.print(m[j][i]+" ");
			}
			System.out.println();
		}	
	}
	*/
	
	/**
	 * Funcion que determina si una matriz es selectiva
	 * @param m matriz de vectores
	 * @return boolean
	 */
	public static boolean esSelectiva (int [][] m) {
		//Para saber si es cuadrada (tiene que tener mismo número de filas y columnas)
		int numFilas = m.length;
		int numColumnas = m[0].length;
		if (numFilas != numColumnas) return false;
		
		for (int i=0; i<m.length; i++) {
			if (m[i][i]!=1) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public static boolean tienePuntoSilla (int [][]m) {
		//buscar mayor de cada fila 
		boolean tienePunto = false;
		for (int i= 0; i<m.length;i++) {
			for (int j=0; j<m[0].length;j++) {
				int maxFila=buscarMaximoFila (m,i);
				int minColumna=buscarMinColumna (m,j);
				if (m[i][j]==maxFila && m[i][j]==minColumna) {
					System.out.println("En la posición ["+i+", "+j+"] "+m[i][j]+" es punto silla.");
					tienePunto=true;
				}
			}
		}
		return tienePunto;
	}
	
	/**
	 * Funcion que busca el maximo de cada fila.
	 * @param m matriz de enteros
	 * @param fil entero
	 * @return entero
	 */
	public static int buscarMaximoFila (int [][]m, int fil) {
		int max = Integer.MIN_VALUE;
		for (int j=0; j<m[0].length;j++) {
			if (m[fil][j]>max) {
				max = m[fil][j];
			}
		}
		return max;
	}
	
	/**
	 * Funcion que busca el minimo de cada fila.
	 * @param m matriz de enteros
	 * @param col entero
	 * @return entero
	 */
	public static int buscarMinColumna(int[][] m, int col) {
		int min = Integer.MAX_VALUE;
		for (int i=0;i<m.length;i++) {
			if (m [i][col]< min) {
				min = m[i][col];
			}
		}
		return min;
	}
	
	/**
	 * Determina si una matriz es simetrica
	 * @param m matriz de enteros
	 * @return boolean
	 */
	public static boolean esSimetrica (int[][]m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] != m[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

}
