package javabasico.aula21.fordebug;

import java.util.Random;

public class ForEach {
public static void main(String[] args) {
	int[] notas = new int[10];
	Random random = new Random();
	
	for(int i =0; i<notas.length; i++) {
		notas[i] = random.nextInt(11);
	}
	
	for(int i=0; i<notas.length;i++) {
		int nota = notas[i];
		System.out.println(nota);
	}
	
	System.out.println("Usando o For each");
	for (int nota : notas) {
		System.out.println(nota);
	}
}
}
