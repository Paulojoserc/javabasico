package vetores_matrizes.vetores.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posi��o: " + i);
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		System.out.println("Vetor A =");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();

		sc.close();
	}
}
