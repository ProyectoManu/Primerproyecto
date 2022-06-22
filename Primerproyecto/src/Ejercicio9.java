import java.util.Scanner;

/**
 * 9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
 *    Mediante la fórmula de Herón raiz(s*(s-a)*(s-b)*(s-c) donde s=(a+b+c)/2.

 * @author Manuel López
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce lado1 ");
		double a = teclado.nextDouble();
		
		System.out.println("Introduce lado2 ");
		double b = teclado.nextDouble();
		
		System.out.println("Introduce lado3 ");
		double c = teclado.nextDouble();
		
		double s =(a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.printf("El área del triángulo de lados %.2f, "
		+" %.2f y %.2f es %.2f",a, b, c,area);
				
		
		
		
		
		
		

	}

}
