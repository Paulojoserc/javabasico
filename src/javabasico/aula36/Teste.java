package javabasico.aula36;

public class Teste {
public static void main(String[] args) {
	Contato contato = new Contato();
	contato.setNome("Tyrion");
	//contato.setEndereco("Kings Landing");
	//contato.setTelefone("11 9999-9999");
	
	// relacionamento tem-um endereço
	
	Endereco end = new Endereco();
	end.setNomeRua("Rua Game of Thrones ");
	end.setNumero("n/a");
	end.setCidade("King Landing");
	end.setEstado("Westeros");
	end.setCep("99999999");
	
	contato.setEndereco(end);
	
	//relacionamento tem-um telefone 
	
	Telefone tel = new Telefone();
	tel.setTipo("celular");
	tel.setDdd("11");
	tel.setNumero(99999999);
	

	Telefone tel2 = new Telefone();
	tel2.setTipo("casa");
	tel2.setDdd("11");
	tel2.setNumero(88888888);
	
	Telefone[] telefones = new Telefone[2];
	telefones[0] = tel;
	telefones[1] = tel2;
	
	contato.setTelefones(telefones);
	
	// teste saída no console 
	System.out.println(contato.getNome());
	//System.out.println(contato.getTelefone());
	
	if (contato != null && contato.getEndereco() != null) {
		System.out.println(contato.getEndereco().getCidade());
	}
	
	/*if (contato != null && contato.getTelefones() != null) {
		System.out.println(contato.getTelefones().getDdd()+" "+contato.getTelefones().getNumero());
	}*/
	
	if (contato !=null && contato.getTelefones() != null) {
		for( Telefone t : contato.getTelefones()) {
			System.out.println(t.getDdd()+ " "+t.getNumero());
		}
	}
}
}
