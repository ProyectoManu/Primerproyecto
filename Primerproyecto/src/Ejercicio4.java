import java.util.Scanner;

/**
 * 4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La 
fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 * @author Manuel López
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		float centigrados;
		
		Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Introduce grados centigrados: ");	
		centigrados =entrada.nextFloat();
		
		float f = 32+ (9 * centigrados / 5);
		System.out.println("son "+f+ "grados fahrenheit");
		

	}

}
