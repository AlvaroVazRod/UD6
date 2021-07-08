package ejercicio8;
import java.util.Scanner;

public class EjercicioArray {
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
			System.out.println("Que numero quieres?");
			try {
				arrayNuevo[i]=Integer.parseInt(teclat.nextLine());
			}catch (NumberFormatException e) {
				System.out.println("Erro el formato es incorrecto "+ e);
			}
		}
	}
	public static void enseñar (int[] arrayNuevo) {
		for (int i = 0; i < arrayNuevo.length; i++) {
			System.out.println(arrayNuevo[i]);
		}
	}
	
}
