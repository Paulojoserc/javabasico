package javabasico24.labs;

public class TesteLampada {
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia_Watts = 7;
		lampada.garantia = 36;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarelo";
		lampada.tipoAbajur = true;
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
	}
}
