package br.com.querubitos.tipoAcao.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.querubitos.tipoAcao.domain.TipoPontuacaoDoAdolescente;

public interface TipoAcaoSpringDataJPARepository extends JpaRepository<TipoPontuacaoDoAdolescente, UUID>{
	List<TipoPontuacaoDoAdolescente> findByIdAdolescenteRecebedor(UUID idAdolescenteRecebedor);
}
