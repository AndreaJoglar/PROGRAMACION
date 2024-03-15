package Ficheros_Vectores;

import java.util.Scanner;

public class LibreriaApoyo {
	static Scanner teclado = new Scanner(System.in);

	/**
	 * Funcion que lee los valores de un vector introducidos
	 * por teclado
	 * @param v vector de enteros
	 */
	public static void leerVector (int v []) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("["+i+"]: ");
			v[i]=teclado.nextInt();
		}
	}
	
	/**
	 * Funcion que muestra por pantalla
	 * los valores de un vector
	 * @param v vector de enteros
	 */
	public static void mostrarVector (int v[]) {
		System.out.print("[");
		for (int i = 0; i < v.length; i++) {
			if (i==v.length-1) {
				System.out.println(v[i]+"]");
			}
			else System.out.print(v[i]+", ");
		}
	}
	
	/**
	 * Funcion que muestra el maximo de un vector
	 * @param v vector de enteros
	 */
	public static void maximo (int v[]) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < v.length; i++) {
			if (v[i]>max) {
				max=v[i];
			}
		}
		System.out.println("El valor máximo del vector es "+max+".");
	}
	
	/**
	 * Funcion que devuelve el valor minimo de un vector
	 * @param v vector de enteros
	 */
	public static void minimo (int v[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < v.length; i++) {
			if (v[i]<min) {
				min=v[i];
			}
		}
		System.out.println("El valor mínimo del vector es "+min+".");
	}
	
	/**
	 * Funcion que muestra la posicion en la que se encuentra
	 * el valor maximo de un vector
	 * @param v vector de enteros
	 */
	public static void posicionValorMaximo (int v[]) {
		int max=Integer.MIN_VALUE;
		int posMax=0;
		for (int i = 0; i < v.length; i++) {
			if (v[i]>max) {
				 max=v[i];
				 posMax=i;
			}
		}
		System.out.println("El valor máximo se encuentra en la posición ["+posMax+"]");
	}
	
	/**
	 * Funcion que muestra la posicion del valor
	 * minimo de un vector
	 * @param v vector de enteros
	 */
	public static void posicionValorMinimo (int v[]){
		int min=Integer.MAX_VALUE;
		int posMin=0;
		for (int i = 0; i < v.length; i++) {
			if (v[i]<min) {
				min=v[i];
				posMin=i;
			}
		}
		System.out.println("El valor mínimo se encuentra en la posición ["+posMin+"]");
	}
	
	/**
	 * Funcion que indica si un valor se encuentra o no dentro de un vector
	 * @param v vector de enteros
	 * @param valor entero
	 * @return boolean
	 */
	public static boolean buscarValor (int v[], int valor) {
		for (int i = 0; i < v.length; i++) {
			if (v[i]==valor) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Funcion que multiplica dos vectores
	 * @param a vector de enteros
	 * @param b vector de enteros
	 * @return vector de enteros
	 */
	public static int [] productoVectorial (int a[], int b[]) {
		int v[]= new int [a.length];
		for (int i = 0; i < v.length; i++) {
			v[i]=a[i]*b[i];
		}
		return v;
	}
	
	/**
	 * Funcion que genera un vector con valores aleatorios
	 * a partir de una dimension y un numero de valor maximo recibido
	 * por teclado
	 * @param dim entero
	 * @param num entero
	 * @return vector de enteros
	 */
	public static int[] vectorAleatorio (int dim, int num) {
		int aleatorio []=new int [dim];
		for (int i = 0; i < aleatorio.length; i++) {
			aleatorio[i]=(int)(Math.random()*num+1);
		}
		return aleatorio;
	}
	
	/**
	 * Funcion que calcula la media de
	 * los valores de un vector
	 * @param v vector de enteros
	 * @return real
	 */
	public static int media (int v[]) {
		int media=0;
		for (int i = 0; i < v.length; i++) {
			media+=v[i];
		}
		media=media/v.length;
		return media;
	}
	
	/**
	 * Funcion que resta a cada valor de un vector
	 * la media del vector y devuelve uno nuevo con los
	 * valores resultantes
	 * @param v vector de enteros
	 * @return vector de enteros
	 */
	public static int [] calculaDiferencia (int v[]) {
		int media=media(v);
		int diferencia[]=new int [v.length];
		for (int i = 0; i < diferencia.length; i++) {
			diferencia[i]=Math.abs(v[i]-media);
		}
		return diferencia;
	}
	
	/**
	 * Funcion que calcula la desviacion de un vector
	 * @param v vector de enteros
	 */
	public static void calcularDesviacion (int v[]) {
		int diferencia []=calculaDiferencia(v);
		int media=media(diferencia);
		System.out.println("Desviación del vector: "+media);
	}
}