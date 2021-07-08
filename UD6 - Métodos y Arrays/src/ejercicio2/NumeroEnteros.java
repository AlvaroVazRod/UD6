package ejercicio2;
import java.util.Random;
import java.util.Scanner;


public class NumeroEnteros {
	static Random randomizador = new Random();
	static Scanner teclat = new Scanner(System.in);
	public static void main (String args[]) {
		int num=0, num1=0, num2=0;
		System.out.println("Cuantos numeros quieres?");
		num=pedidaNumeros(num);
		System.out.println("Desde que numero a que numero?");
		num1=pedidaNumeros(num1);
		num2=pedidaNumeros(num2);
		for (int i = 0; i < num; i++) {
			System.out.println(aleatorio(num1,num2));
		}

	}
	public static int pedidaNumeros (int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}
	public static int aleatorio (int num1, int num2) {
		return randomizador.nextInt((num1-num2)+1)+num2;
	}
}
