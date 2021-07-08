package ejercicio9;
import java.util.Random;
import java.util.Scanner;

public class ArrayAleatorios {
	static Random randomizador = new Random();
	static Scanner teclat = new Scanner(System.in);
	public static void main(String args[]) {
		int num = 0;
		int[] nuevaArray;
		System.out.println("Que numero quieres? ");
		num=pedidaNumeros(num);
		nuevaArray = new int [num];
		rellenar(nuevaArray);
		enseñar(nuevaArray);
	}
	public static int pedidaNumeros (int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}
	public static void rellenar (int[] arrayNuevo) {
		for (int i = 0; i < arrayNuevo.length; i++) {
			arrayNuevo[i]=randomizador.nextInt(10-0);
		}
	}
	public static void enseñar (int[] arrayNuevo) {
		for (int i = 0; i < arrayNuevo.length; i++) {
			System.out.println(arrayNuevo[i]);
		}
	}
}
