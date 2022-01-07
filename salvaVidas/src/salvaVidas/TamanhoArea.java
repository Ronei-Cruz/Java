package salvaVidas;

import java.util.Scanner;

public class TamanhoArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A área do circulo é %.2f m\n", area);
		
		if(area > 0 && area <= 1000) {
			System.out.println("A área precisará de 1 salva-vidas!");
		}
		else if (area > 1000 && area <= 10000) {
			System.out.println("A área precisará de 2 salva-vidas!");
		}
		else if (area > 10000 && area <= 100000) {
			System.out.println("A área precisará de 3 salva-vidas!");
		}
		else if (area > 100000) {
			System.out.println("A área precisará de 4 salva-vidas!");
		}
		

	}

}
