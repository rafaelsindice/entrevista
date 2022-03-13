package br.com.serasa.controller.VO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.serasa.model.Pessoa;

public class PessoaVO {
	private Long  id ;

	private String nome ;

	private String telefone;

	private int idade;

	 private String cidade ;

	private String estado;

	private int  score;
public PessoaVO(Pessoa pessoa) {
	this.id = pessoa.getId();
	this.nome = pessoa.getNome();
	this.telefone=pessoa.getTelefone();
	this.idade=pessoa.getIdade();
	this.cidade=pessoa.getCidade();
	this.estado=pessoa.getEstado();
	this.score=pessoa.getScore();
	
			
			
			
			
			
	
}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public int getIdade() {
		return idade;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public int getScore() {
		return score;
	}

	public static List<PessoaVO> converter(List<Pessoa> pessoa) {
		
		return pessoa.stream().map(PessoaVO::new).collect(Collectors.toList());
	}

	public static List<PessoaVO> converter(Optional<Pessoa> pessoa) {
		return pessoa.stream().map(PessoaVO::new).collect(Collectors.toList());
	}
	
}
