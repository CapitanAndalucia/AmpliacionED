import java.util.Random;
import java.util.Scanner;

public class Moneda {
/**
 * Realiza un programa que pregunte al usuario si quiere lanzar una moneda o un dado.
	Que pregunte cuantas veces se va a lanzar
	Que pregunte que valor saldrá más veces.
	Que lance la moneda o el dado el número de veces seleccionadas
	Y comente cuantas veces ha acertado el usuario.
	Utiliza funciones para los lanzamientos y las preguntas.
	Utiliza la clase Random y NO Math.random().
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int contadordado = 0;
		String Juego = PreguntaJuego(teclado);
		System.out.println("Se ha seleccionado : " + Juego);
		
		if(Juego.equals("Dado")) {
			
			int vecesdado = cuantasVeces(teclado);
			System.out.println("sE VA A LANZAR " + vecesdado);
			
//			for (int i = 1; i <= numcaradado; i++) {
//				
//				ladoDado(numcaradado);
//				if(numcaradado == numcaradado) {
//					contadordado ++;
//				}else {
//					
//				}
				
			System.out.println("Ha salido repetido " + contadordado);	
				
			}
			System.out.println("Numero de dados: " + ladoDado(numcaradado));
			
		}else if(respuesta == "Moneda") {
			System.out.println("Dime cuantas veces quieres lanzar el dado");
			int numcaradado = sc.nextInt();
			System.out.println("Numero de dados: " + ladoDado(numcaradado));
		}
	}
	
	public static String PreguntaJuego(Scanner sc) {
		System.out.println("Que quieres lanzar? Dado/Moneda");
		String respuesta = sc.nextLine();
		return respuesta;
	}
	public static int cuantasVeces(Scanner sc) {
		System.out.println("Dime cuantas veces quieres lanzar el dado");
		int numcaradado = sc.nextInt();
		return numcaradado;
	}
	public static int ladoDado(int Caradado) {
		Random rnd = new Random();
		
		int dadorandom = rnd.nextInt(Caradado)+1;
		
		return dadorandom;
	}
	
	public static boolean caraMoneda(int CAraMoneda) {
		Random rdr = new Random();
		
		boolean cararandom = rdr.nextBoolean();
		
		return cararandom;
	}

}
