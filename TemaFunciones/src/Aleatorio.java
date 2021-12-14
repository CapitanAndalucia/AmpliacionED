import java.util.Scanner;

public class Aleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		
		int caras = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Lanzamiento: " + i + " Cara seleccionada: " + lanzaDado(caras));
		}
		sc.close();
		
	}
	/**
	 * Funcion que lanza un dado de la caras que se paan como parametro
	 * @param numcaras numero de caras que tiene el dado
	 * @return int con la cara seleccionada en el lanzamiento
	 */
	public static int lanzaDado(int numcaras) {
		int CaraSeleccionada = -1;
		
		if(numcaras>0) 
			CaraSeleccionada = (int)(Math.random() * numcaras + 1);
		
		return CaraSeleccionada;
	
	}

}
