package br.com.generation.classesobj06;

public class ContaClasse {
	
	private String nome;
	private int conta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void debito(double valor) {
		saldo -= valor;
	}

}
