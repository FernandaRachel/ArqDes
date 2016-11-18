package ex_2_2_Factory_Method;

public class AcessarProvedorPublico extends AcessarProvedor {

	@Override
	public Informacoes getInfo() {

		return new ProvedorPublico();
	}

}
