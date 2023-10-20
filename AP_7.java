package Entorn_Desrrollo_completo;

import java.util.Scanner;

public class AP_7 {
	public static void main (String[] args) {
		int num;
		int resultado;
		int imul;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Elija un numero del 1 al 10 para mostrarle su tabla de multiplicar");
		num=teclado.nextInt();
		if (num>=1 && num<=10) {
				for (int i = 1;i<11;i++) {
					resultado=num * i;
					System.out.println(num + " x " + i + " = " + resultado);
				}
			}
			else
				System.out.println("Numero no valido, ejecute de nuevo el programa y escriba un numero del 1 al 10.");
		}
	}
