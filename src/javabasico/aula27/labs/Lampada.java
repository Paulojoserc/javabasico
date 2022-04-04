package javabasico.aula27.labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia_Watts;
	String cor;
	String tipoLuz;
	int garantia;
	double valor;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {

		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostraEstado() {
		if (ligada) {
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}
