import java.util.Scanner;
/**
 * 8. Programa que calcula el volumen de una esfera.
 * @author Manuel López
 *
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el radio ");
		double radio = teclado.nextDouble();
		
		double volumen = 4/3.0*3.14159*radio*radio*radio;
		// double volumen = 4/3.0*Math.PI*Math.pow(radio, 3);
		System.out.printf(" el volumen es %.2f volumen",volumen);
		
		
		
		
	}

}
