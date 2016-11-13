package ex_2_1;

public class CriarSobrenomeNome implements Nome {

	@Override
	public void gravarNome(String nome, String sobrenome) {
	//	System.out.printf( "\n"+ sobrenome, " " + nome );
		System.out.println(sobrenome+ ",");
		System.out.println(nome + "\n" );
	}

}
