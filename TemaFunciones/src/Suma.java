import java.util.Scanner;

/**
* Main
* 
* Llama dos veces a leeNumero para leer dos números
* 
* Llama a division para calcular el resultado de la divisón
* 
* Muestra el resultado
* 
* @param args
*/
public class Suma {
	
	public static void main(String[] args) {
		
		
//		
//		System.out.println("Dime un numero:");
//		int num1 = sc.nextInt();
//		
//		System.out.println("Dime otro numero: ");
//		int num2 = sc.nextInt();
//		//Suma(); //Este es la suma del void
//		
//		int resultado = Suma(num1, num2);
//		//num1 y num2 le da los valores que hemos introducido a las
//		//variables dentro de la funcion SUMA
//		
//		System.out.println("Resultado: " + resultado);
		
		Scanner sc2 = new Scanner(System.in);
		
		float num;
		
		float resultado = leeNumero(new Scanner(System.in));
		
		float resultado2 = leeNumero(new Scanner(System.in));
		

		float n1 = 0, n2 = 0;
		
		float resultadodivi = division(n1,n2);
		
		System.out.println("La division es: " + resultadodivi);
		
	}
	
		public static int Suma(int num1, int num2) {
		//Se "copian" las variables del main para trabajar con ellas
		// y luego pegarlas en el main
			
			return num1 + num2;
		
		}
		
		public static void Suma() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Dime un numero:");
			int num1 = sc.nextInt();
			
			System.out.println("Dime otro numero: ");
			int num2 = sc.nextInt();
			
			int resultado = num1 + num2;
		
			System.out.println("Resultado: " + resultado);
		
	}
		/**
		* Función leeNumero
		* Pide un número al usuario y lo devuelve
		* 
		* @param sc de tipo Scanner preparado para leer
		* por teclado
		* @return float número con decimales leído por teclado
		*/
		public static float leeNumero(Scanner sc) {
			
			
			System.out.println("Dime un numero con decimales:");
			float num = sc.nextFloat();
			
			return num;
			
		}
		
		/**
		* Función division
		* Suma dos números que se pasan por teclado
		* 
		* @param n1 tipo float
		* @param n2 tipo float
		* 
		* @return float resultado de n2/n1
		*/

		public static float division(float n1, float n2) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Dime con decimales: ");
			n1 = sc.nextFloat();
			System.out.println("DIme otro numero con decimales");
			n2 = sc.nextFloat();
			return n1/n2;
		}

}
