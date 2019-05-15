import java.util.*;

public class ProducaoAcademica {

	private List listaPublicacoes = new ArrayList();
	private List listaOrientacoes = new ArrayList();

	public List getListaPublicacoes() {
		return listaPublicacoes;
	}

	public void addListaPublicacoes(Publicacao publicacao) {
		listaPublicacoes.add(publicacao);
	}
	
	public List getListaOrientacoes() {
		return listaPublicacoes;
	}

	public void addListaOrientacoes(int orientacao) {
		listaOrientacoes.add(orientacao);
	}
	
}
