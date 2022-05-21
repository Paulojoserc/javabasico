package javabasico.aula42;

public class Teste {
public static void main(String[] args) {
	
	Pessoa pessoa = new Pessoa();
	
	//Pessoa aluno = new Aluno();
	//pessoa prfossor = new Professor();
	
	Aluno aluno = new Aluno();
	Professor professor = new Professor();
	
	
	System.out.println(pessoa);
	System.out.println(aluno);
	System.out.println(professor);
	
	//exemplo 02
	
	System.out.println(Constante.URL_BLOG);
}
}
