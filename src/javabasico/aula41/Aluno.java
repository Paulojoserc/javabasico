package javabasico.aula41;

public class Aluno extends Pessoa {

	
	private String curso;
	private double [] notas;
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean aprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("343545456");
		
		this.setCpf("3454564565");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endere�o do Aluno: ";
		s += super.getEndereco();
		
		return s;
	}
	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
		
	}
}
