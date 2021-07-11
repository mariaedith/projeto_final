package br.inatel.projeto_final.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CryptoUtils {

	//criaremos m�todos est�ticos (pertencentes a classe) para n�o ter que criar instancias de crypto
	
	public static void ExecutaCrypto(Path arquivo, String frase, int chave) {
		
		//para construir palavras novas com o deslocar e salvar das letras
		StringBuilder textoCrypto = new StringBuilder();
		
		for (int i = 0; i < frase.length(); i++) {
			textoCrypto.append((char)(frase.charAt(i) + chave)); 
			/*
			 * Primeiro busco caracter na posi��o i, somo com a chave e terei de retorno um n�mero
			 * Para que o n�mero volte a ser letra uso o char
			 * Depois de ter a letra eu salvo na StringBuilder
			 * TextoCrypto vai constuindo os caracteres deslocados formando a frase
			 */
		}
		
		try {
			Files.writeString(arquivo, textoCrypto.toString());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String ExecutaDecrypto(Path arquivo, int chave) {
		
		StringBuilder fraseDecodificada = new StringBuilder();
		String fraseCrypto = null;
		
		try {
			fraseCrypto = Files.readString(arquivo);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < fraseCrypto.length(); i++) {
			fraseDecodificada.append((char)(fraseCrypto.charAt(i) - chave));
		}
		
		return fraseDecodificada.toString();
	}
} 
