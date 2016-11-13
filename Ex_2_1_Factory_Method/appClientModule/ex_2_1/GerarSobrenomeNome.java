package ex_2_1;

public class GerarSobrenomeNome extends GerarNome {

	@Override
	public Nome getNome() {
		
		return new CriarSobrenomeNome();
	}

}
