package javabasico.aula18.breakcontinue.atividade;

import java.util.Scanner;

public class Brack01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Entre com um n�mero");
	int num = sc.nextInt();
	
	System.out.println("Entre com um limite");
	int max = sc.nextInt();
	
	for(int i=num; i <=max; i++) {
		System.out.println(i);
		if (i % 7 == 0) {
			System.out.println("O valor de i �: "+ i);
			break;
		}
	}
	
	sc.close();
}
}
