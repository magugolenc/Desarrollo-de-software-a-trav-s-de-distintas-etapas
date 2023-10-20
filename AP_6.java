package Entorn_Desrrollo_completo;
import java.util.Scanner;
public class AP_6 {
	    public static void main(String[] args) {
	        int n;
	        int resultado=0;
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("Introduce un número entero");
	        n = teclado.nextInt();
	        for (int i=1;i<=n;i++) {
	        	resultado +=i;
	        	System.out.println('\n' + "Su numero es " + n + " y el conteo va por " + resultado);
	        }
	}
}

