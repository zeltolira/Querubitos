package br.com.querubitos.querubitos.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.querubitos.querubitos.domain.Querubitos;

public interface QuerubitoSpringDataJPARepository extends JpaRepository<Querubitos, UUID>{

	
}
