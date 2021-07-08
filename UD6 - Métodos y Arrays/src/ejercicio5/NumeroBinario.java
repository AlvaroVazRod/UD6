package ejercicio5;
import java.util.Scanner;

public class NumeroBinario {
	static Scanner teclat = new Scanner(System.in);
	public static void main(String args[]) {
		int num = 0;
		System.out.println("Que numero quieres? ");
		num=pedidaNumeros(num);
		System.out.println(binario(num));
	}
	public static int pedidaNumeros (int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}
	public static String binario(int num) {
		String resultado="",contador;
		while(num>0) {
			if(num%2==1) {
				contador="1";
			}else {
				contador="0";
			}
			resultado=contador+resultado;
			num=num/2;
		}
		return resultado;
	}
}
