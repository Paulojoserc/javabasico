package javabasico.aula17.labs;

import java.util.Scanner;

public class Exer01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean notaValida = false;
	
	do {
		System.out.println("Digite uma nota");
		double nota = sc.nextDouble();
		
		if (nota>=0 && nota <=10) {
			notaValida = true;
			System.out.println("Voc� digitou: "+nota);
		}else {
			System.out.println("Nota invalida ");
		}
	}
 while (!notaValida);
	
	
	sc.close();
}
}
