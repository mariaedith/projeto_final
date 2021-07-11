package br.inatel.projeto_final.jogadores;

import java.util.Random;

public class Inimigo {

	private String nome, arma;
	private int vida;
	private int idade;
	
	//Constructor
		public Inimigo (String nome, int vida, String arma, int idade) {
			this.nome = nome;
			this.vida = vida;
			this.arma = arma;
			this.idade = idade;
		}
			
	//Atividade
		public int atacar() {
			System.out.println("Inimigo atacando!");
			Random dano = new Random();
	        return dano.nextInt(2);
		}
			
		public void decremento() {
		       if (vida > 0) {
		           vida--;
		       } else {
		           System.out.println("O inimigo " + this.nome + " perdeu vida!");
		       }
		   }
		
		 private void incremento() {
		        if (vida < 5) {
		            vida++;
		        }
		    }
		 
		public void alimentar() {
	        incremento();
	    }
		
		public void alimentarTotalmente() {
	        if (vida == 5) {
	            incremento();
	        } else {
	            incremento();
	            alimentarTotalmente();
	        }
	    }
		
	//Getters
		public String getNome () {
			return nome;
		}
		public int getVida () {
			return vida;
		}
		public String getArma () {
			return arma;
		}
		public int getIdade () {
			return idade;
		}
}
