package br.com.serasa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serasa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
Optional<Pessoa> findById(Long id);
}
