package br.inatel.projeto_final.jogadores;

import java.util.Random;

public class Heroi {

		private String nome, arma;
		private int vida, idade;

	//Constructor
		public Heroi (String nome, int vida, String arma, int idade) {
			this.nome = nome;
			this.vida = vida;
			this.arma = arma;
			this.idade = idade;
		}
		
	//Atividade
		public int atacar() {
			System.out.println("Her�i atacando!");
			Random dano = new Random();
	        return dano.nextInt(2);
		}

	    private void incremento() {
	        if (vida < 5) {
	            vida++;
	        }
	    }

	    private void decremento() {
	        if (vida > 0) {
	            vida--;
	        } else {
	            System.out.println("O her�i " + this.nome + " est� sem vida!");
	        }
	    }
		
		public int lutar(Inimigo player2) {
	        do {
	            int dano1 = atacar();
	            
	            if (dano1 == 1) {
	                player2.decremento();
	            }
	            
	            if (player2.getVida() > 0) {
	                int dano2 = player2.atacar();
	                if (dano2 == 1) {
	                    decremento();
	                }
	            }
	            
	            if (vida == 0) {
		            decremento();
		            
		            return 2;
		        } else {
		            player2.decremento();
		            
		            return 1;
		        }
	            
	        } while ((vida > 0) && (player2.getVida() > 0));

	   
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
		
	//Getters e Setters
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

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setArma(String arma) {
			this.arma = arma;
		}

		public void setVida(int vida) {
			this.vida = vida;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		
	}
	

