package br.com.generation.classesobj01;

public class ClienteClasses {

	private String nome;
	private String sexo;
	private int idade;
	private int totalCarrinho;
	
	public int getTotalCarrinho() {
		return totalCarrinho;
	}
	public void setTotalCarrinho(int totalCarrinho) {
		this.totalCarrinho = totalCarrinho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void carrinho(int valor) {
		totalCarrinho += valor;
	}

}


