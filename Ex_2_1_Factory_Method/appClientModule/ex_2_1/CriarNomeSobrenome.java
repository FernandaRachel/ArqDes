package ex_2_1;

public class CriarNomeSobrenome implements Nome {

	@Override
	public void gravarNome(String nome, String sobrenome) {

		// System.out.printf(nome, " " + sobrenome + "\n");
		System.out.println(nome + ",");
		System.out.println(sobrenome + "\n");

	}
}
