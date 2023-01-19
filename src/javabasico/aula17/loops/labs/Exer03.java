package javabasico.aula17.loops.labs;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean infoValida = false;
		String name, sexo, estCivil;
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
			System.out.println("Entre com o sexo: ");
			sexo = sc.next();
			
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			}else {
				System.out.println("Sexo precisa ser 'f' ou 'm' .");
			}
			
		}while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com seu estado civil");
			estCivil = sc.next();
			if(estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") || 
					estCivil.equalsIgnoreCase("d") || estCivil.equalsIgnoreCase("v") ) {
				infoValida = true;
			}else {
				System.out.println("Estado civel precisa ser 's', 'c', 'd' ou 'v'");
			}
		}while (!infoValida);
		
		System.out.println("As seguintes informações foram coletadas");
		System.out.println("Nome: " +name);
		System.out.println("Idade: " +idade);
		System.out.println("Salário: " +salario);
		System.out.println("Sexo: " +sexo);
		System.out.println("Estado civil: " +estCivil);
		
		sc.close();
	}
}
