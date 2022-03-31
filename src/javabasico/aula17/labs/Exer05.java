package javabasico.aula17.labs;


import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double popA;
		double popB;
		double taxaA;
		double taxaB;

		boolean valido = false;
		do {

			System.out.println("Entre com a popula��o A: ");
			popA = sc.nextDouble();

			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("Digite uma valor superior a 0");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Entre com a popula��o B: ");
			popB = sc.nextDouble();

			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("Digite uma valor superior a 0");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Entre com a taxa de crescimento da popula��o A: ");
			taxaA = sc.nextDouble();

			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("Digite uma valor superior a 0");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Entre com a taxa de crescimento da popula��o B: ");
			taxaB = sc.nextDouble();

			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("Digite uma valor superior a 0");
			}

		} while (!valido);
		int cont = 0;
		while (popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("O numero de anos � " + cont);
		sc.close();
	}
}
