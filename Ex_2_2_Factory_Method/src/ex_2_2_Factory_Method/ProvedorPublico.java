package ex_2_2_Factory_Method;

public class ProvedorPublico implements Informacoes {

	@Override
	public void acessarInformacoes(String info) {
		System.out.print("META-INF/ProvedorPublico.txt");
		
		/*if (chave.equals("")) {
			return "META-INF/ProvedorPublico.txt";
		}*/

	}

}
