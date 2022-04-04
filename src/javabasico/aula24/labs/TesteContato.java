package javabasico.aula24.labs;

public class TesteContato {
public static void main(String[] args) {
	Contato contato1 = new Contato();
	
	contato1.nome = "Paulo";
	contato1.email = "paulo@hotmail.com";
	contato1.endereco = "Rua dos Esquecidos";
	contato1.telefones = new  String[5];
	
	contato1.telefones[0]= "8532954211";
	
}
}
