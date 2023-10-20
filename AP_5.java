package Entorn_Desrrollo_completo;

import java.util.Scanner;

public class AP_5 {
	public  static void main (String[] arg) {
		int edades;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce tu edad para poder decirte en que etapa de la vida te encuentras");
		edades=teclado.nextInt();
		if(edades < 12)
			System.out.println("Usted se encuentra en el rango de los Infantes");
		else if (edades >=12 && edades <=17)
			System.out.println("Usted se encuentra en el rango de los Adolescentes");
		else if (edades >=18 && edades <=60)
			System.out.println("Usted se encuentra en el rango de los Adultos");
		else
			System.out.println("Usted se encuentra en el rango de los Ancianos");
	}
}
