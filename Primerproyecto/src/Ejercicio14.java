import java.util.Scanner;

/**
 * 14. Programa que calcula el número de la suerte de una persona a partir de su fecha de 
nacimiento.
 * @author Manuel López
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cálculo del número de la suerte: ");
		System.out.println("Día Nacimiento: ");
		int día=teclado.nextInt();
		System.out.println("Mes Nacimiento: ");
		int mes=teclado.nextInt();
		System.out.println("Año Nacimiento: ");
		int año=teclado.nextInt();
		
        int suma = día+mes+año;
        
        int numSuerte= suma/1000;
        numSuerte = numSuerte + suma%1000/100;
        numSuerte = numSuerte + suma%1000%100/10;
        numSuerte = numSuerte + suma%1000%100%10;
        
        System.out.println("Tu número de la suerte es: "+numSuerte);
        
	}

}
