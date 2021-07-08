package ejercicio1;

import java.util.Scanner;

public class Areas {
	static Scanner teclat = new Scanner(System.in);

	public static void main(String args[]) {
		int num = 0;
		menu(num);
	}

	public static void muestraMenu() {
		System.out.println("\n\nOpcions del menu:");
		System.out.println("\n\t1. Circulo");
		System.out.println("\t2. Triangulo");
		System.out.println("\t3. Cuadrado");
		System.out.println("\t4.Salir");
		System.out.print("\n\t\t\tIndica opcio:");
	}

	public static void menu(int num) {
		boolean cerrar = true;
		muestraMenu();
		while (num == 0) {
			try {
				num = Integer.parseInt(teclat.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error el formato es incorrecto " + e);
			}
		}
		while (num != 4 && cerrar != false) {
			switch (num) {
			case 1:
				opcion1();
				break;
			case 2:
				opcion2();
				break;
			case 3:
				opcion3();
				break;
			case 4:
				cerrar = false;
				break;
			default:
				break;
			}
			if (num != 4) {
				muestraMenu();
				try {
					num = Integer.parseInt(teclat.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Error el formato es incorrecto " + e);
					num = 0;
				}
			}
		}
	}

	public static void opcion1() {
		double radio = 0;
		System.out.println("Has elegido el Circulo.");
		while (radio == 0) {
			try {
				System.out.print("Necesito que me des el radio: ");
				radio = Double.parseDouble(teclat.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error el formato es incorrecto " + e);
			}
		}
		System.out.println("El area del Circulo es de " + (Math.pow(radio, 2) * Math.PI));
	}

	public static void opcion2() {
		double base = 0, altura = 0;
		System.out.println("Has elegido el Triangulo.");
		while (base == 0) {
			try {
				System.out.print("Necesito que me des la base: ");
				base = Double.parseDouble(teclat.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error el formato es incorrecto " + e);
			}
		}
		while (altura == 0) {
			try {
				System.out.print("Necesito que me des la altura: ");
				altura = Double.parseDouble(teclat.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error el formato es incorrecto " + e);
			}
		}
		System.out.println("El area del Circulo es de " + ((base*altura)/2));
	}

	public static void opcion3() {
		double lado = 0;
		System.out.println("Has elegido el Cuadrado.");
		while (lado == 0) {
			try {
				System.out.print("Necesito que me des el lado: ");
				lado = Double.parseDouble(teclat.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error el formato es incorrecto " + e);
			}
		}
		System.out.println("El area del Circulo es de " + (lado*lado));
	}
}
