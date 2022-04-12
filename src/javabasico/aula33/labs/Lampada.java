package javabasico.aula33.labs;

public class Lampada {
	private String modelo;
	private String tensao;
	private int potencia_Watts;
	private String cor;
	private String tipoLuz;
	private int garantia;
	private double valor;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	public Lampada() {	}
	
		
	
	public Lampada(String modelo, String tensao, int potencia_Watts, String cor, String tipoLuz, int garantia,
			double valor, String[] tipos, boolean tipoAbajur, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia_Watts = potencia_Watts;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantia = garantia;
		this.valor = valor;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}



	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencia_Watts() {
		return potencia_Watts;
	}
	public void setPotencia_Watts(int potencia_Watts) {
		this.potencia_Watts = potencia_Watts;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {

		setLigada(true);
	}

	public void desligar() {
		setLigada(false);
	}

	public void mostraEstado() {
		if (isLigada()) {
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}
	public void mudarEstado() {
		if (isLigada()) {
			desligar();
		} else {
			ligar();
		}
	}
}