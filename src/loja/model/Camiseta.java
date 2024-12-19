package loja.model;

public class Camiseta extends Roupa {
	private String modelo;

	public Camiseta(String tamanho, int quantidade, String tecido, String modelo) {
		super(tamanho, quantidade, tecido);
		this.modelo = modelo;	
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
