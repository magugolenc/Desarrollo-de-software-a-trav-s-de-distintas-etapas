package Entorn_Desrrollo_completo;

import java.util.Scanner;

public class AP_4 {
	public static void main (String[] args) {
		int Dia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 1 numero del 1 al 7 por favor");
		Dia = teclado.nextInt();
		if(Dia==1)
			System.out.println("El día " + Dia + " de la semana es el Lunes");
		else if(Dia==2)
			System.out.println("El día " + Dia + " de la semana es el Martes");
		else if(Dia==3)
			System.out.println("El día " + Dia + " de la semana es el Miércoles");
		else if(Dia==4)
			System.out.println("El día " + Dia + " de la semana es el Jueves");
		else if(Dia==5)
			System.out.println("El día " + Dia + " de la semana es el Viernes");
		else if(Dia==6)
			System.out.println("El día " + Dia + " de la semana es el Sábado");
		else if(Dia==7)
			System.out.println("El día " + Dia + " de la semana es el Domingo");
		else
			System.out.println("Error, por favor introduce un numero del 1 al 7");
	}
}
