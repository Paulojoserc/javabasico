package javabasico.aula48;

public class MultiplosCatch {
	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] demon = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + demon[i] + " = " + (numeros[i] / demon[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por 0");
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posi��o do arrey inv�lida");
			}
		}
	}
}
