package ejercicio7;
import java.util.Scanner;

public class Moneda {


	static Scanner teclat = new Scanner(System.in);
	public static void main(String args[]) {
		int num = 0;
		String moneda = "";
		System.out.println("Que numero quieres? ");
		num=pedidaNumeros(num);
		System.out.println("Que moneda quieres? ");
		moneda=pedidaMoneda(moneda);
		cambio(num,moneda);
	}
	public static int pedidaNumeros (int num) {
		try {
			num = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		return num;
	}
	public static String pedidaMoneda (String moneda) {
		moneda=teclat.nextLine().toLowerCase();
		return moneda;
	}
	public static void cambio(int num,String moneda) {
		switch (moneda) {
		case "libra": 
			System.out.println(num*0.86);
			break;
		case "dolar":
			System.out.println(num*1.28611);
			break;
		case "yen":
			System.out.println(num*129582);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + moneda);
		}
	}

}