package triagem;

public class Paciente {
	private String nome;
	private String cpf;
	private String idade;
	private String sexo;
	
	public Paciente() {
		
	}
	
	public Paciente(String nome, String cpf, String idade, String sexo) {
		setIdade(idade);
		setNome(nome);
		setCpf(cpf);
		setSexo(sexo);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}

