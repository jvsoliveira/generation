package br.com.generation.classesobj03;

public class EletricClasse {
	
	private String marca;
	private String tipo;
	private double preco;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	void desconto(double valor) {
		preco -= valor;
	}

}
