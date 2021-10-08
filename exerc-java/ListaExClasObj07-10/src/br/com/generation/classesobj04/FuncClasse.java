package br.com.generation.classesobj04;

public class FuncClasse {
	
	private String nome;
	private String funcao;
	private String sexo;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getFuncao() {
		return funcao;
	}



	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	void atrasou() {
		System.out.println("Ele atrasou...");
	}

}
