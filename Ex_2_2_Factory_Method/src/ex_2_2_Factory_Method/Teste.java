package ex_2_2_Factory_Method;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Teste {

	public String retornarProvedor(String chave) {
		// IF-ELSE para escolher provedor

		try {
			// String chave;
			if (chave.equals("")) {
				FileReader arq = new FileReader("META-INF/ProvedorPublico.txt");
				BufferedReader lerArq = new BufferedReader(arq);
				System.out.println(lerArq);

			} else if (chave.equals("Design Pattern")) {
				FileReader arq = new FileReader("META-INF/ProvedorPrivado.txt");
				BufferedReader lerArq = new BufferedReader(arq);
				System.out.println(lerArq);

			}

		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		return chave;
	}

	public static void main(String[] args) {

		Teste t = new Teste();

		// Painel apra escolher o servidor
		t.retornarProvedor(JOptionPane.showInputDialog("Escolha o servidor"));

	}

}
