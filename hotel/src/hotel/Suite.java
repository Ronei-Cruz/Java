package hotel;

public class Suite {
	private String nomeSuite;
	private double valor;
	private int quantidade;
	private int numQuarto;
	
	public Suite() {
		
	}
	
	public Suite(String nomeSuite, int numQuarto, double valor, int quantidade) {
		this.nomeSuite = nomeSuite;
		this.valor = valor;
		this.quantidade = quantidade;
		this.numQuarto = numQuarto;
		}
	
	public String getNomeSuite() {
		return nomeSuite;
	}
	public void setNomeSuite(String nomeSuite) {
		this.nomeSuite = nomeSuite;
	}
	public int getNumQuarto(){
		return numQuarto;
	}
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
