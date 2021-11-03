package br.com.generation.classesobj02;

public class AviaoClasse {

		private String marca;
		private String modelo;
		private int ano;
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		void decolar() {
			System.out.println("Ele decolou...");
		}
		
		void pousar() {
			System.out.println("Ele acaba de pousar!!");
		}

}
