package ex_2_2_Factory_Method;

public abstract class AcessarProvedor {

	public void acessarProvedor(String chave) {
		Informacoes i = getInfo();
		i.acessarInformacoes(chave);

	}

	public abstract Informacoes getInfo();
}
