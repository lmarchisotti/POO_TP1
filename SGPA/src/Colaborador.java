import java.util.*;

public class Colaborador {

	private Collection listaProjetos = new ArrayList();
	private Collection listaProducaoAcademica = new ArrayList();
	
	private String nome, email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Collection getListaProjetos() {
		return listaProjetos;
	}

	public void setListaProjetos(Collection listaProjetos) {
		this.listaProjetos = listaProjetos;
	}

	public Collection getListaProducaoAcademica() {
		return listaProducaoAcademica;
	}

	public void setListaProducaoAcademica(Collection listaProducaoAcademica) {
		this.listaProducaoAcademica = listaProducaoAcademica;
	}
	
	public String imprimir() {
		// Percorrer as listas e concatenar em uma string para exibir junto de nome e email.
		
		return "";
	}
	
}
