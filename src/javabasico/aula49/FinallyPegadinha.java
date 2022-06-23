package javabasico.aula49;

public class FinallyPegadinha {
	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] demon = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + demon[i] + " = " + (numeros[i] / demon[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por 0");
				System.exit(0);
			} catch (Throwable e2) {
				System.out.println("Ocorreu um erro");
				System.exit(0);
			} finally {
				System.out.println("Esta linha é impressa sempre após o try ou catch");
				System.out.println();
			}
		}
	}
}
