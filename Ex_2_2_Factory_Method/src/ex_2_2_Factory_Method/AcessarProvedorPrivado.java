package ex_2_2_Factory_Method;

public class AcessarProvedorPrivado extends AcessarProvedor {

	@Override
	public Informacoes getInfo() {
		// TODO Auto-generated method stub
		return new ProvedorPrivado();
	}

}
