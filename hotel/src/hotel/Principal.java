package hotel;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		hotel.Hospede hospede = new Hospede();
		hotel.Suite suite = new Suite();
		
		int diasDeReserva, idade = 0;
		double valorDias = 0; 
		double desconto = 0;
		
		//Cadastra o Hospede responsavel pela aloca��o
		String nome = (JOptionPane.showInputDialog("Nome: "));
		String endereco = (JOptionPane.showInputDialog("Rua, n�mero:"));
		String cidade = (JOptionPane.showInputDialog("Cidade:"));
		String estado = (JOptionPane.showInputDialog("Estado (sigla):"));
		
		do {
			try {
				idade  = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Somente n�meros inteiros");
			}
		}while((idade < 18) || (idade >= 120));
		
		hospede = new Hospede(nome, endereco, cidade, estado, idade);
		
		JOptionPane.showMessageDialog(null,"Hospede: " + hospede.getNome().toUpperCase() 
										+ "\nRua: " + hospede.getEndereco().toUpperCase() + "\nCidade: " + hospede.getCidade().toUpperCase() 
										+ " - " + hospede.getEstado().toUpperCase() +"\nIdade: " + hospede.getIdade());
		
		
		double valor = 0;
		int escolha, quantidade = 0;
		String quarto = null;
		String crianca = null;
		//Criar o do while para quantidade de pessoas
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Quarto para quantas pessoas?"));
			int crianca2 = Integer.parseInt(JOptionPane.showInputDialog("Crian�as menores de 2 anos?\n[1] - SIM\n[2] - N�O"));
			if(crianca2 == 1) {
				crianca = "SIM";
				int escolha2 = Integer.parseInt(JOptionPane.showInputDialog("Quantas?"));
				escolha = escolha - escolha2;
			}
			else {
				crianca = "N�O";
			}
			
			// Indica��o do quarto para hospede de acordo com a quantidade de pessoas.
			if (escolha > 5){
				JOptionPane.showMessageDialog(null, "Ultrapassa o n�mero de pessoas por quarto");
			}
			else if ((escolha <=3)) {
				JOptionPane.showMessageDialog(null, "Indicamos o quarto CONVENCIONAL\nPara at� 3 pessoas");
				quarto = "CONVENCIONAL";
				quantidade = escolha;
				valor = 150;	
			}
			else if((escolha > 3) || (escolha <= 5)) {
				JOptionPane.showMessageDialog(null, "Indicamos o quarto FAM�LIA\nPara at� 5 pessoas");
				quarto = "FAM�LIA";
				quantidade = escolha;
				valor = 300;
			}
			
		}while(escolha > 5);
		
		int numQuarto = Integer.parseInt(JOptionPane.showInputDialog("N�mero do quarto:"));
		
		suite = new Suite(quarto, numQuarto, valor, quantidade);
		
		//Calcular o deseconto caso seja feita a reserva para 7 dias ou mais
		diasDeReserva = Integer.parseInt(JOptionPane.showInputDialog("Reserva para quantos dias?"));
		if(diasDeReserva >= 7) {
			valorDias = (suite.getValor() * diasDeReserva);
			desconto = valorDias - ((valorDias * 10)/100);
		}else{
			valorDias = suite.getValor() * diasDeReserva;
			desconto = valorDias;
		}
		
		//Mostra dados da reserva
		JOptionPane.showMessageDialog(null,"Su�te: " + suite.getNomeSuite() + "\nN�mero: " + suite.getNumQuarto() +"\nDormit�rio para: "+ suite.getQuantidade() 
										+ " pessoas\nValor da di�ria: R$" + valor + "\nReserva para: "+ diasDeReserva 
										+ " dias\nValor total: R$" + desconto + "\nCrian�as at� 2 anos: " + crianca);
		JOptionPane.showMessageDialog(null, "Programa finalizado com Sucesso");
	}

}
