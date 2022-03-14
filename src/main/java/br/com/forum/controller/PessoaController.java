package br.com.forum.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


import br.com.forum.controller.vo.PessoaVO;
import br.com.forum.controller.form.PessoaForm;
import br.com.forum.model.Pessoa;
import br.com.forum.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping
	public List<PessoaVO> listarPessoa(Long id) {
		if (id == null) {
			List<Pessoa> pessoa = pessoaRepository.findAll();
			return PessoaVO.converter(pessoa);
		}
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		return PessoaVO.converter(pessoa);

	}

	@PostMapping
	public ResponseEntity<PessoaVO> cadastrar(@RequestBody PessoaForm form, UriComponentsBuilder uriBuilder) {
		Pessoa pessoa = form.converter();
		pessoaRepository.save(pessoa);
		URI uri =uriBuilder.path("/pessoa/{id}").buildAndExpand(pessoa.getId()).toUri();
		return ResponseEntity.created(uri).body(new PessoaVO(pessoa));
	}

}
