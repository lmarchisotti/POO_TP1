import java.util.*;

public class Orientacao extends ProducaoAcademica {

	private List listaOrientacoes = new ArrayList();

	public List getListaOrientacoes() {
		return listaOrientacoes;
	}

	public void addListaOrientacoes(int orientando) {
		listaOrientacoes.add(orientando);
	}
	
}
