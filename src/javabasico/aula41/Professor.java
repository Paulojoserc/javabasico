package javabasico.aula41;

public class Professor extends Pessoa {
	
	private String curso;
	private double salario;
	private String nomeCursos;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCursos() {
		return nomeCursos;
	}
	public void setNomeCursos(String nomeCursos) {
		this.nomeCursos = nomeCursos;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		
		return s;
	}
	@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimendo o endereço do professor");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
}	
	
