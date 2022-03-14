package br.com.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forum.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
@Override
Optional<Pessoa> findById(Long id);
}
