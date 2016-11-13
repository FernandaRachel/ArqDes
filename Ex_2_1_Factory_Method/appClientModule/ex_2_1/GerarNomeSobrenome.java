package ex_2_1;

public class GerarNomeSobrenome extends GerarNome {

	@Override
	public Nome getNome() {
		
		return new CriarNomeSobrenome();
	}

}
