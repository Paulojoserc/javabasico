package javabasico.aula50;

import java.util.Scanner;

public class UsandoThrows {
	public static void main(String[] args) {
		System.out.println("Digite um n�mero");
	try {
		double num = leNumero();
		System.out.println("Voc� digitou "+num);
	}catch(Exception e ) {
		System.out.println("Entrada inv�lida");
		e.printStackTrace();
	}
	
	}
	public static double leNumero() throws Exception{
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}
}
