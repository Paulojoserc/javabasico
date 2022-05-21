package javabasico.aula43;

public class Teste {
public static void main(String[] args) {
	Aluno aluno = new Aluno();
	
	aluno.setCurso("Analise de Sistema");
	double[] notas = {10, 9, 8, 7};
	aluno.setNotas(notas);
	
	System.out.println(aluno);
	
	String s1 = "afdsdfsdf";
	String s2 = "afdsdfsdf";
	
	System.out.println(s1.equals(s2));
	
	Aluno aluno2 = new Aluno();
	aluno2.setCurso("Ciência da Computação");
	double[] notas2 = {10, 9, 8, 7};
	aluno2.setNotas(notas2);
	
	System.out.println(aluno ==aluno2);
}
}
