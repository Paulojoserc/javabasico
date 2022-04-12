package javabasico.aula31;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}

	public double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	private double divideKmPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	public double calcularCombustivel(double km) {
		return this.divideKmPorConsumoCombustivel(km);
	}

}
