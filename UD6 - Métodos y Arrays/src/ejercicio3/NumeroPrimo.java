package ejercicio3;

import java.util.Scanner;

public class NumeroPrimo {
	static Scanner teclat = new Scanner(System.in);

	public static void main(String args[]) {
		int num = 0;
		System.out.println("Que numero quieres? ");
		num=pedidaNumeros(num);
		System.out.println(primo(num));
	}
	public static int pedidaNumeros (int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}
	public static boolean primo(int num) {
		int contador = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			return true;
		} else {
			return false;
		}
	}
}
