package loja.model;

public class Roupa {

	private String tamanho;
	private int quantidade;
	private String tecido;

	public Roupa(String tamanho, int quantidade, String tecido) {
		this.tamanho = tamanho;
		this.quantidade = quantidade;
		this.tecido = tecido;

	}


	public String getTamanho() {
		
		 
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}

}
