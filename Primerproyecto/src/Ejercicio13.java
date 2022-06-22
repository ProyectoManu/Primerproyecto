import java.util.Scanner;

/**
 * 13. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el final 
igual que en el ejemplo.

 * @author Manuel López
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		System.out.printf("El numero es %d\n",num);
		
		System.out.printf("%5d\n",num%10);
		System.out.printf("%5d\n",num%100);
		System.out.printf("%5d\n",num%1000);
		System.out.printf("%5d\n",num%10000);
		System.out.printf("%5d\n",num);
		
		

	}

}
