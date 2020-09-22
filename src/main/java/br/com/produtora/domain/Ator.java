package br.com.produtora.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Ator {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ator_id")
	private Long id;
	
	@Size(max=100, message="O nome do ator não pode ser maior que 100 caracteres!")
	@NotEmpty(message="O nome do ator é obrigatório!")
	private String nome;
	
	@Size(max=10, message="A data de nascimento do ator não pode ser maior que 10 caracteres!")
	@NotEmpty(message="A data de nascimento do ator é obrigatória!")
	private String dataNascimento;
	
	@Size(max=1, message="O sexo do ator não pode ser maior que 1 caracter!")
	@NotEmpty(message="O sexo do ator é obrigatória!")
	private String sexo;
	
	@Size(max=500, message="A biografia do ator não pode ser maior que 500 caracteres!")
	@NotEmpty(message="A biografia do ator é obrigatória!")
	private String biografia;

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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
}
