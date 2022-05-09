package javabasico.aula39;

public class Professor extends Pessoa {
	
	private String curso;
	private double salario;
	private String nomeCursos;
	
	public void verificarAcesso() {
		super.nomeVisibilidade = "Maria ";
		this.nomeVisibilidade = "Paulo";
		
		
	}
	
	
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
}	
	
