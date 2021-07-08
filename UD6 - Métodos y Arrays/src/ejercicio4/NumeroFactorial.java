package ejercicio4;
import java.util.Scanner;

public class NumeroFactorial {
	static Scanner teclat = new Scanner(System.in);
	public static void main(String args[]) {
		int num = 0;
		System.out.println("Que numero quieres? ");
		num=pedidaNumeros(num);
		System.out.println(factorial(num));
	}
	public static int pedidaNumeros (int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}
	public static int factorial(int num) {
		int contador = num;
		for (int i = num; i > 1; i--) {
			contador=contador*(i-1);
		}
		return contador;
	}
}
