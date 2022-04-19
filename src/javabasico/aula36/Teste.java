package javabasico.aula36;

public class Teste {
public static void main(String[] args) {
	Contato contato = new Contato();
	contato.setNome("Tyrion");
	//contato.setEndereco("Kings Landing");
	//contato.setTelefone("11 9999-9999");
	
	// criar objeto endereço
	
	Endereco end = new Endereco();
	end.setNomeRua("Rua Game of Thrones ");
	end.setNumero("n/a");
	end.setCidade("King Landing");
	end.setEstado("Westeros");
	end.setCep("99999999");
	
	Telefone tel = new Telefone();
	
	contato.setEndereco(end);
	
	System.out.println(contato.getNome());
	System.out.println(contato.getTelefone());
	
	if (contato != null && contato.getEndereco() != null) {
		System.out.println(contato.getEndereco().getCidade());
	}
}
}
