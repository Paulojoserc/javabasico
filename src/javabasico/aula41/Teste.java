package javabasico.aula41;


public class Teste {
public static void main(String[] args) {
	//Pessoa pessoa = new Pessoa();
	Pessoa aluno = new Aluno();
	Pessoa professor = new Professor();
	
	//pessoa.setEndereco("Rua 1, num 1");
	aluno.setEndereco("Rua 2, num 2");
	professor.setEndereco("Rua 1, num 2");
	
	//System.out.println(pessoa.obterEtiquetaEndereco());
//	System.out.println(aluno.obterEtiquetaEndereco());
	//System.out.println(professor.obterEtiquetaEndereco());
	
	aluno.imprimirEtiquetaEndereco();
	System.out.println();
	professor.imprimirEtiquetaEndereco();
}
}
