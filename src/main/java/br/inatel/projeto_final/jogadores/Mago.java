package br.inatel.projeto_final.jogadores;

public class Mago extends Heroi {
	
	//Constructor
	public Mago(String nome, int vida, String arma, int idade) {
		super(nome, vida, arma, idade);
	}
	
	//Atividade	
	@Override
	public int atacar() {
		super.atacar();
		System.out.println("O mago " + this.getNome() + " est� realizando um ataque com magia!");
		return 0;
	}
	
}
