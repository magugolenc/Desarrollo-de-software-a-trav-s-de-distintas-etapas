package Entorn_Desrrollo_completo;

import java.util.Scanner;

public class AP_3 {
	public static void main (String[]args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduzca el primer numero entero: ");
		
		num1= teclado.nextInt();
		
		System.out.println("Introduzca el segundo numero entero: ");
		
		num2= teclado.nextInt();
		
		System.out.println("Introduzca el tercer numero entero: ");
		num3 = teclado.nextInt();
		
		if (num1 > num2 & num1 > num3)
			System.out.println("El primer numero es el mayor");
		else if (num1 < num2 & num1 > num3)
			System.out.println("El segundo numero es el mayor");
		else if (num1 < num2 & num2 < num3)
			System.out.println("El tercer numero es el mayor");
		else if(num1 == num3 && num1 < num2)
			System.out.println("Su segundo numero es mayor que el resto");
		else if(num2 == num3 && num2 < num1)
			System.out.println("Su primer numero es mayor que el resto");
		else if(num1 == num2 && num1 < num3)
			System.out.println("Su tercer numero es mayor que el resto");
		else if(num1==num2 && num1==num3 && num2==num3)
			System.out.println("Sus numeros son iguales");
		else if(num1 == num3 && num1 > num2)
			System.out.println("Tanto el primero como el tercer numero son los mayores");
		else if(num1 == num2 && num1 > num3)
			System.out.println("Tanto el primero como el segundo numero son los mayores");
		else if(num2 == num3 && num2 < num1)
			System.out.println("Tanto el segundo como el tercer numero son los mayores");
			
			
		

		
		
	}

}
