package estudoCaso;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Jogo {
	
	private final Scanner scanner = new Scanner(System.in);
	private final ListIterator<estudoCaso.Animal> animais;
	
	private Jogo(ListIterator<estudoCaso.Animal> animais) {
		this.animais = animais;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Jogo jogo = novo();
		jogo.executarEtapa(EtapaFactory.iniciar());
	}

	public static Jogo novo() {
		List<estudoCaso.Animal> animais = new ArrayList();
		animais.add(new estudoCaso.Animal( "Golfinho", "sabe nadar"));
		animais.add(new estudoCaso.Animal( "Macaco", "come banana"));
		return new Jogo(animais.listIterator());
	}
	
	void executarEtapa(Consumer<estudoCaso.Jogo> jogo) {
		jogo.accept(this);
	}
	
	void resetarAnimais() {
		while(animais.hasPrevious()) {
			animais.previous();
		}
	}
	
	Boolean chegouFim() {
		return animais.hasNext();
	}

	Animal proxAnimal() {
		return animais.next();
	}

	void addAnimal(Animal animal) {
		this.animais.add(animal);
		
	}
}