package javabasico.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

	private int tamanho;
	private String ra�a;
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getRa�a() {
		return ra�a;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimantar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
