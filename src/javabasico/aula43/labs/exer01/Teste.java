package javabasico.aula43.labs.exer01;

public class Teste {
	public static void main(String[] args) {
		System.out.println("*** Teste ContaBancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta Simples");
		contaSimples.setNumConta("11111");

		contaSimples.depositar(100);

		realizarSaque(contaSimples, 50);

		realizarSaque(contaSimples, 70);
		System.out.println(contaSimples);

		System.out.println("*** Teste Conta Poupança ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente conta Poupança");
		contaPoupanca.setNumConta("222222");
		contaPoupanca.setDiaRendimento(11);

		contaPoupanca.depositar(100);
		realizarSaque(contaPoupanca, 50);

		realizarSaque(contaPoupanca, 70);

		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hojé não é dia de rendimento, novo saldo não calculado");
		}
		System.out.println(contaPoupanca);

		System.out.println("*** Teste Conta Especial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente conta Especial");
		contaEspecial.setNumConta("333333");
		contaEspecial.setLimite(50);

		contaEspecial.depositar(100);
		realizarSaque(contaEspecial, 50);

		realizarSaque(contaEspecial, 70);
		System.out.println(contaEspecial);
		
	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de =" + conta.getSaldo());
		}
	}
}
