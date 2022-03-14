package br.com.forum.controller.form;

import br.com.forum.model.Pessoa;

public class PessoaForm {
	private String nome ;

	private String telefone;

	private int idade;

	 private String cidade ;

	private String estado;

	private int  score;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Pessoa converter() {
		
		return new Pessoa(nome, telefone, idade, cidade, estado, score);
	}
}
