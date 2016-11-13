package ex_2_1;

public abstract class GerarNome {
	
	public void gerarNome(String nome, String sobrenome) {
		
		// Aqui n�o criamos uma instancia
		// pois classes abstratas n�o podem ser estanciadas
		Nome n = getNome();
		n.gravarNome(nome, sobrenome);
	}

	public abstract Nome getNome();
}
