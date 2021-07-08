package ejercicio11;

import java.util.Random;
import java.util.Scanner;

public class DobleArray {
	static Random randomizador = new Random();
	static Scanner teclat = new Scanner(System.in);

	public static void main(String args[]) {
		int num = 0;
		int[] array1, array2,array3;
		System.out.println("Que numero quieres? ");
		num = pedidaNumeros(num);
		array1 = new int[num];
		array2 = new int[num];
		array3 = new int[num];
		rellenar(array1, array2);
		array3=tercerArray(array1,array2);
		enseñar(array1,array2,array3);
	}

	public static int pedidaNumeros(int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}

	public static void rellenar(int[] array1, int[] array2) {
		int contador = 0, num=0;;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = randomizador.nextInt(10 - 0);
		}
		while (contador < array2.length) {
			num=randomizador.nextInt(array1.length-0);
			if(array2[num]==0) {
				array2[num]=array1[contador];
				contador++;
			}
		}

	}
	public static int[] tercerArray (int[] array1, int[] array2) {
		int[] array3= new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i]=array1[i]*array2[i];
		}
		return array3;
	}

	public static void enseñar(int[] array1, int[] array2,int[] array3) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+"\t");
		}
		System.out.println("\n");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+"\t");
		}
		System.out.println("\n");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]+"\t");
		}
	}
}
