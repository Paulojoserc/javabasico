package javabasico.aula27.labs;

public class TesteLampada {
public static void main(String[] args) {
	
	Lampada lampada = new Lampada();
	
	lampada.ligar();
	
	lampada.mostraEstado();
	
	lampada.desligar();
	
	lampada.mostraEstado();
	
	lampada.mudarEstado();
	
	lampada.mostraEstado();

}
}
