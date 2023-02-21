package br.com.querubitos.adole.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.querubitos.adole.domain.Adolescente;

public interface AdolescenteSpringDataJPARepository extends JpaRepository<Adolescente, UUID>{

}