package br.inatel.projeto_final.jogadores;

public class Arqueiro extends Guerreiro {

	//Constructor
	public Arqueiro (String nome, int vida, String arma, int idade) {
		super(nome, vida, arma, idade);
	}
	
	//Atividade
	@Override
	public int atacar() {
		super.atacar();
		System.out.println("O arqueiro " + this.getNome() + " est� realizando um ataque de habilidade!");
		return 0;
	}
}

