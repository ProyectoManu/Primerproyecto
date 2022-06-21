import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		float num1, num2;
		float media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num1 = entrada.nextFloat();
		
		System.out.println("Introduce otro numero ");
			
		num2 = entrada.nextFloat();
		
		media =(num1+num2)/2.0f;
		System.out.println("La media es: "+media);
		
		
		

	}

}
