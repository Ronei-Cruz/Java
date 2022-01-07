package hotel;

public class Hospede {
	
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private int idade;
	
	public Hospede() {
		
	}
	
	public Hospede (String nome, String endereco, String cidade, String estado, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.idade = idade;
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
