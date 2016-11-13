package ex_2_1;

public class Teste {

	public static void main(String[] args) {
		// Gera formato nome, sobrenome
		GerarNome gn = new GerarNomeSobrenome();
		gn.gerarNome("Fernanda", "Tavares");
		gn.gerarNome("Shelcyr", "Palacios");

		// Gera formato sobrenome, nome
		gn = new GerarSobrenomeNome();
		gn.gerarNome("Fernanda", "Tavares");
		gn.gerarNome("Shelcyr", "Palacios");
	}

}
