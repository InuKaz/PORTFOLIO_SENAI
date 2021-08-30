package acesso_bd;

public class Pessoa {
	
	String cpf, id_carro, nome, endereco, telefone;

	public Pessoa (String cpf, String id_carro, String nome, String endereco, String telefone) {
		this.cpf = cpf;
		this.id_carro = id_carro;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getId_carro() {
		return id_carro;
	}

	public void setId_carro(String id_carro) {
		this.id_carro = id_carro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}