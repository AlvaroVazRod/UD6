package ejercicio12;

import java.util.Random;
import java.util.Scanner;

public class ArrayDigitos {
	static Random randomizador = new Random();
	static Scanner teclat = new Scanner(System.in);

	public static void main(String args[]) {
		int num = 0, num1 = 0, num2;
		int[] nuevaArray, array2;
		System.out.println("Que numero quieres? ");
		num = pedidaNumeros(num);
		nuevaArray = new int[num];
		rellenar(nuevaArray);
		System.out.println("Que digito quieres? ");
		num1 = pedidaNumeros(num1);
		num2 = enseñar(nuevaArray, num1);
		array2 = new int[num2];
		rellenar2(nuevaArray,array2,num1);
		enseñar(array2);
	}

	public static int pedidaNumeros(int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}

	public static void rellenar(int[] arrayNuevo) {
		for (int i = 0; i < arrayNuevo.length; i++) {
			arrayNuevo[i] = randomizador.nextInt(300 - 1);
		}
	}

	public static int enseñar(int[] arrayNuevo, int digito) {
		int contador = 0;
		for (int i = 0; i < arrayNuevo.length; i++) {
			if (arrayNuevo[i] % 10 == digito) {
				System.out.print(arrayNuevo[i] + "\t");
				contador++;
			}
		}
		System.out.println();
		return contador;
	}

	public static void rellenar2(int[] arrayNuevo, int[] array2,int digito) {
		int contador = 0;
		for (int i = 0; i < arrayNuevo.length; i++) {
			if (arrayNuevo[i] % 10 == digito) {
				array2[contador] = arrayNuevo[i];
				contador++;
			}
		}
	}

	public static void enseñar(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "\t");
		}
		System.out.println();
	}
}
