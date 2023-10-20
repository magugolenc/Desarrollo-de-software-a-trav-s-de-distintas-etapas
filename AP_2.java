package Entorn_Desrrollo_completo;

import java.util.Scanner;

public class AP_2 {
		public static void main(String[] args) {
			double km;
			double km_hora;
			double tiempo;
			double resultado;
			double hora;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca los kilometros que va a recorrer");
		km=teclado.nextDouble();
		System.out.println("Introduzca la velocidad media a la que va a ir en Km/H");
		km_hora=teclado.nextDouble();
		tiempo = km/km_hora;
		resultado = tiempo*60;
		hora= resultado/60;
		System.out.println("Usted tardara " + hora + "horas");
	}
}
