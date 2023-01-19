package javabasico.aula19.arrays.lab;

import java.util.Scanner;

public class _01elemntosInteiros {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] vetorA = new int[5];
	int[] vetorB = new int[5];
	
	for(int i=0; i<vetorA.length; i++) {
		System.out.println("Entre com o valor da posição: "+i);
		vetorA[i] = sc.nextInt();
		
		vetorB[i]= vetorA[i];
	}
	System.out.println("Vetor A = ");
	for (int i=0; i<vetorA.length; i++) {
		System.out.print(vetorA[i] + " ");
	}
	System.out.println();
	
}
}
