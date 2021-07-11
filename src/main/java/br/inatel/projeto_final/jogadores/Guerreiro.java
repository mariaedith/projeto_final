package br.inatel.projeto_final.jogadores;

public class Guerreiro extends Heroi {

	//Constructor
	public Guerreiro (String nome, int vida, String arma, int idade) {
		super(nome, vida, arma, idade);
	}
	
	//Atividade
	@Override
	public int atacar() {
		super.atacar();
		System.out.println("O guerreiro " + this.getNome() + " est� realizando um ataque de for�a!");
		return 0;
	}
 
}
	
