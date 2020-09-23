package br.com.produtora.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Genero {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="genero_id")
	private Long id;
	
	@Size(max=150, message="O nome do gênero não pode ser maior que 150 caracteres!")
	@NotEmpty(message="O nome do gênero é obrigatório!")
	private String nome;
	
	@Size(max=500, message="A descrição do gênero não pode ser maior que 500 caracteres!")
	@NotEmpty(message="A descrição do gênero é obrigatório!")
	private String descricao;
	
	@OneToMany(mappedBy="genero")
	private List<Filme> filmes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
