package javabasico.aula17.labs;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean senhavalida = false;

		System.out.println("Digite nome do usuário");
		String user = sc.next();

		System.out.println("Digite a senha");
		String senha = sc.next();

		do {
			if (user.equalsIgnoreCase(senha)) {
				
				System.out.println("Senha igual a nome do usuário, digite novamente.");
				senha = sc.next();
			} else {
				senhavalida = true;
				System.out.println("Senha e usuário validos");
				
			}
		} while (!senhavalida);

		sc.close();

	}
}