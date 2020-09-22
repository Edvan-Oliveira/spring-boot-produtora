package br.com.produtora.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="filme_id")
	private Long id;
	
	@Size(max=200, message="O titulo do filme não pode ser maior que 200 caracteres!")
	@NotEmpty(message="O titulo do filme é obrigatório!")
	private String titulo;
	
	@Size(max=10, message="A data de lançamento do filme não pode ser maior que 10 caracteres!")
	@NotEmpty(message="A data de lançamento do filme é obrigatória!")
	private String dataLancamento;
	
	@Size(max=500, message="A sinopse do filme não pode ser maior que 500 caracteres!")
	@NotEmpty(message="A sinopse do filme é obrigatória!")
	private String sinopse;
	
	@NotNull(message="O gênero do filme é obrigatória!")
	private Genero genero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
