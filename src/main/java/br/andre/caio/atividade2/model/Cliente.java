package br.andre.caio.atividade2.model;

public class Cliente {
	private long id;
	private String nome;
	private int idade;
	private String email;
	private String endereco;
	private String genero;
	private String telefone;
	private String produtoPref;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getProdutoPref() {
		return produtoPref;
	}
	public void setProdutoPref(String produtoPref) {
		this.produtoPref = produtoPref;
	}
	
	
}