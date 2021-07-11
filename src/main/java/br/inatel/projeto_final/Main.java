package br.inatel.projeto_final;

	import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import br.inatel.projeto_final.jogadores.Guerreiro;
import br.inatel.projeto_final.jogadores.Heroi;
import br.inatel.projeto_final.jogadores.Inimigo;
import br.inatel.projeto_final.utils.CryptoUtils;

	public class Main {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
	        boolean jogo = true;
	        
	        Heroi Player1 = new Guerreiro("Dandara", 5, "Culverins", 29);
	        Inimigo Player2 = new Inimigo("Xazam", 5 , "Scalibur", 32);
	      

			Path arquivo = Paths.get("frase.txt");
		
			String frase = ("O nome do inimigo �: " + Player2.getNome() + ", com vida igual a "
					+ Player2.getVida() + ",\ne sua principal arma � a: " + Player2.getArma() +
					", aprimorada nos seus " + Player2.getIdade() + " anos de idade.");

			CryptoUtils.ExecutaCrypto(arquivo, frase, 6);
			String fraseLimpa = CryptoUtils.ExecutaDecrypto(arquivo, 6);
			System.out.println(fraseLimpa);

		
	        while (jogo) {
	            System.out.println();
	            System.out.printf("Her�is X Inimigo \n Entre com: \n 1 - para renomear heroi; \n 2 - para jogar;"
	            		+ "\n 3 - para alimentar personagem; \n 4 - para sair do jogo.", "1 - Renomear Heroi", "2 - Jogar",
	            		"3 - Alimentar personagem", "4 - Exit");
	            
	            int escolha = input.nextInt();
	            input.nextLine();
	            System.out.println();
	            
	            switch (escolha) {
	                case 1: {
	                    System.out.print("Nome do seu her�i: ");
	                    Player1.setNome(input.nextLine());
	                    break;
	                }
	                case 2: {
	                	int x = Player1.lutar(Player2);
	                    System.out.println();
	                    System.out.println("Vencedor:");
	                    
	                    if (x == 1) {
	                        System.out.println(Player1.getNome());
	                    } else {
	                        System.out.println(Player2.getNome());
	                    }
	                    
	                    break;
	                }
	                case 3: {
	                    System.out.println("Escolha o Guerreiro: ");
	                    System.out.println(" 1 - Heroi " + Player1.getNome());
	                    System.out.println(" 2 - Inimigo " + Player2.getNome());
	                    System.out.println(" 3 - Alimentar Ambos Totalmente");
	                
	                    switch (input.nextInt()) {
	                        case 1: {
	                            Player1.alimentar();
	                            
	                            break;
	                        }
	                        case 2: {
	                            Player2.alimentar();
	                            
	                            break;
	                        }
	                        case 3: {
	                            Player1.alimentarTotalmente();
	                            Player2.alimentarTotalmente();
	                        }
	                    }
	                    
	                    break;
	                }
	                case 4: {
	                    jogo = false;
	                    input.close();
	                
	                    break;
	                }
	            }
	        }
	    }
	}
