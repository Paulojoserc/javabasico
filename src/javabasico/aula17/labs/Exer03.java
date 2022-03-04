package javabasico.aula17.labs;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean infoValida = false;
		String name;
		int idade;
		double salario;
		
		do {
			System.out.println("Entre com o nome:");
			name = sc.next();

			if (name.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de no mínomo 3 caracteres.  ");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com a idade:");
			idade = sc.nextInt();
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}

		} while (!infoValida);

		infoValida = false;
		do {

			System.out.println("Entre com o salário");
			salario = sc.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0.");
			}

		} while (!infoValida);
		
		infoValida = false;
		do {
		
			
		}while (!infoValida);
		
		sc.close();
	}
}
