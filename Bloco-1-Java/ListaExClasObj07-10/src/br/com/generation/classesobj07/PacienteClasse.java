package br.com.generation.classesobj07;

public class PacienteClasse {
	
	private String nome;
	private String sexo;
	private String plano;
	
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

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	void exame() {
		System.out.println("Seu exame está pronto!");
	}


}
