package ejercicio6;
import java.util.Scanner;

public class NumeroCifras {
	static Scanner teclat = new Scanner(System.in);
	public static void main(String args[]) {
		int num = 0;
		System.out.println("Que numero quieres? ");
		num=pedidaNumeros(num);
		System.out.println(cifras(num));
	}
	public static int pedidaNumeros (int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}
	public static int cifras(int num) {
		String numero;
		int num1=0;
		numero=String.valueOf(num);
		num1=numero.length();
		return num1;
	}
}
