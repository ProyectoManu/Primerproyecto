import java.util.Scanner;

/**
 * 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud 
de la hipotenusa según el teorema de Pitágoras. 
 * @author Manuel López
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce cateto 1 ");
		
		double cateto1 = teclado.nextDouble();
		System.out.println("Introduce cateto 2 ");
		double cateto2 = teclado.nextDouble();
		
		double hipotenusa=Math.sqrt(cateto1*cateto1+cateto2*cateto2);
	//  System.out.println("la hipotenusa es: "+hipotenusa);
		System.out.printf("%.2f cateto1 %.2f cateto2 la hipotenusa es %.2f hipotenusa",cateto1,cateto2,hipotenusa);
	}

}
