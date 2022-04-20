package javabasico.aula36.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda");
		String nome = sc.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		Contato[] contatos = new Contato[3];
		for (int i=0; i<3; i++) {
			System.out.println("Entre com as informações do contato "+(i+1));
			Contato c = new
		}
		
		
		sc.close();
	}
}
