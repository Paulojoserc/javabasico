package javabasico.aula24.labs;

import java.util.Date;

public class TesteBiblioteca {
public static void main(String[] args) {
	
	Biblioteca biblioteca = new Biblioteca();
	
	biblioteca.nome = "Dev";
	biblioteca.autor = "Paulo";
	biblioteca.anoLancamento = 2001;
	
	biblioteca.emprestimo = true;
	biblioteca.dataEntrega = new Date();
	biblioteca.locador = "João";
	
	System.out.println("Nome do livro = " +biblioteca.nome);
}
}
