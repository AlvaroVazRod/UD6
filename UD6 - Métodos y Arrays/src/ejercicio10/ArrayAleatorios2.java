package ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class ArrayAleatorios2 {
	static Random randomizador = new Random();
	static Scanner teclat = new Scanner(System.in);

	public static void main(String args[]) {
		int num = 0, num1 = 0, num2 = 0;
		int[] nuevaArray;
		System.out.println("Que numero quieres? ");
		num = pedidaNumeros(num);
		System.out.println("Que numero maximo de random quieres? ");
		num1 = pedidaNumeros(num1);
		System.out.println("Que numero minimo de random quieres? ");
		num2 = pedidaNumeros(num2);
		nuevaArray = new int[num];
		rellenar(nuevaArray, num1, num2);
		enseñar(nuevaArray);
	}

	public static int pedidaNumeros(int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}

	public static void rellenar(int[] arrayNuevo, int num1, int num2) {
		int numeroMayor = 0;

		for (int i = 0; i < arrayNuevo.length; i++) {

			arrayNuevo[i] = primo(num1, num2);

			if (numeroMayor < arrayNuevo[i]) {
				numeroMayor = arrayNuevo[i];
			}
		}
		System.out.println("El nuemro mas grande es " + numeroMayor);
	}

	public static int primo(int num1, int num2) {
		int contador = 0, num = 0;
		boolean numeroAcertado = false;
		while (numeroAcertado == false) {
			num = randomizador.nextInt((num1 - num2) + 1) + num2;
			System.out.println(num);
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				numeroAcertado = true;
			} else {
				numeroAcertado = false;
			}
			contador=0;
		}
		return num;
	}

	public static void enseñar(int[] arrayNuevo) {
		for (int i = 0; i < arrayNuevo.length; i++) {
			System.out.print(arrayNuevo[i]+"\t");
		}
	}
}
