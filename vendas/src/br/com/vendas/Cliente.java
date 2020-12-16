package br.com.vendas;

public class Cliente {

	
	private Integer id;
	private String nome;
	private String email;
	private Boolean especial;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEspecial() {
		return especial;
	}
	public void setEspecial(Boolean especial) {
		this.especial = especial;
	}
	
	
	public Cliente(Integer id, String nome, String email, Boolean especial) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.especial = especial;
	}
	
	public Cliente() {
		super();
		
	}
	
	public void setAll(Integer id, String nome, String email, Boolean especial) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.especial = especial;
	}	

	
	
	
}
