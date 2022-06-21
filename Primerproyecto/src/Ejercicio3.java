import java.util.Scanner;

/**
 * 3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla 
el doble y el triple de ese número.

 * @author Manuel López
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		float num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero ");
		
		num = entrada.nextFloat();
		/*
		float doble = num*2;
		float triple = num*3;
		
		System.out.println("El doble es: ")+doble+ "y el triple "+triple);*/
		
		System.out.println("El doble es:"+num*2+ " y el triple "+num*3);
		
		System.out.println("el numero mas 2 es ");

	}

}
