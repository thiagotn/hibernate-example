package example.hibernate.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Fornecedor {

	@Id @GeneratedValue
	private Long id;
	
	private String nome;
	
	private String descricao;

	@ManyToMany
	private List<Funcionario> contatos;
	
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

	public List<Funcionario> getContatos() {
		return contatos;
	}

	public void setContatos(List<Funcionario> contatos) {
		this.contatos = contatos;
	}
	
}
