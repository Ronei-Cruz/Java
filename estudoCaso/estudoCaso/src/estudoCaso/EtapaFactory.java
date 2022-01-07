package estudoCaso;

import java.util.function.Consumer;

class EtapaFactory {
	
	static Consumer<estudoCaso.Jogo> iniciar() {
		return jogo -> {
			jogo.resetarAnimais();
			System.out.println("Pense em um animal!");
			
			try {
				Thread.sleep(2000);
			} catch (Exception ex) {
				
			}
			jogo.executarEtapa(perguntarCaracteristica());
		};
	}

	private static Consumer<estudoCaso.Jogo> perguntarCaracteristica() {
		return jogo -> {
			if(jogo.chegouFim()) {
				estudoCaso.Animal animal = jogo.proxAnimal();
				String resposta = Mensageiro.perguntar("O animal que voce pensou " + animal.getCaracteristica() + "?");
				System.out.println(resposta);
				if ("S".equals(resposta)) {
					jogo.executarEtapa(tentarAdivinhar(animal));
				}
				else {
					jogo.executarEtapa(perguntarCaracteristica());
				}
			}
			else {
				jogo.executarEtapa(desistir());
			}
		};
	}

	private static Consumer<estudoCaso.Jogo> tentarAdivinhar(Animal animal) {
		return jogo -> {
			String resposta = Mensageiro.perguntar("O animal que voce pensou e um " + animal.getNome() + "?");
			if ("S".equals(resposta)) {
				jogo.executarEtapa(encerrarJogo());
			}
			else {
				jogo.executarEtapa(perguntarCaracteristica());
			}
		};
	}
	
	private static Consumer<estudoCaso.Jogo> encerrarJogo() {
		return jogo -> {
			System.out.println("Eu acertei!");
			
			String resposta = Mensageiro.perguntar("Vamos jogar novamente?");
			if ("S".equals(resposta)) {
				jogo.executarEtapa(iniciar());
			}
			else {
				System.out.println("Ok! Ate a proxima");
			}
		};
	}
	
	private static Consumer<estudoCaso.Jogo> desistir() {
		return jogo -> {
			String nome = Mensageiro.perguntar("Desisto. Qual animal voce pensou? ");
			String caracteristica = Mensageiro.perguntar("Qual caracteristica dele?");
			jogo.addAnimal(new estudoCaso.Animal(nome, caracteristica));
			jogo.executarEtapa(encerrarJogo());
		};
	}

}
