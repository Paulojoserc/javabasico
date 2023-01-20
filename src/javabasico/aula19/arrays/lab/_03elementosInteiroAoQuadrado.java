package javabasico.aula19.arrays.lab;

import java.util.Scanner;

/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2. */
public class _03elementosInteiroAoQuadrado {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] vetorA = new int[15];
    int[] vetorB = new int[vetorA.length];
    
    for (int i=0; i<vetorA.length; i++){
        
        System.out.println("Entre com o valor da posi��o: " + i);
        vetorA[i] = sc.nextInt();
        
        vetorB[i] = vetorA[i] * vetorA[i];
    }
    
    System.out.print("Vetor A = ");
    for (int i=0; i<vetorA.length; i++){
        System.out.print(vetorA[i] + " ");
    }
    System.out.println();
    
    System.out.print("Vetor B = ");
    for (int i=0; i<vetorB.length; i++){
        System.out.print(vetorB[i] + " ");
    }
    System.out.println();
	
	sc.close();
}
}
