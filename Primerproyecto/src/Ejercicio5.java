import java.util.Scanner;

/**
 * 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y 
muestra por pantalla la longitud y el área de la circunferencia. Longitud de la 
circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2 
 * @author Manuel López
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		double radio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la circunferencia : ");
		radio= entrada.nextDouble();
		
		double longitud = 2*3.14159*radio;
		double area =3.14159*Math.pow(radio,2);
		
		System.out.println("La longitud de la circunferencia es "+longitud);
		
		System.out.println(" Y el area de la circunferencia es "+area);
		
		

	}

}
