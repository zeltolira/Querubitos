package br.com.querubitos.tipoAcao.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "quiz")
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idQuiz", updatable = false, unique = true, nullable = false)
	private UUID idQuiz;
	@NotNull
	private Integer quiz = 10;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraUltimaAlteracao;
	
	
	public Quiz(UUID idQuiz, @NotNull Integer quiz) {
		this.idQuiz = idQuiz;
		this.quiz = quiz;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	

	
}
