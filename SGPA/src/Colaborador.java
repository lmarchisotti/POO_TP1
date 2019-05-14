import java.util.*;

public class Colaborador {

	private List listaProjetos = new ArrayList();
	private List listaProducaoAcademica = new ArrayList();
	
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
	
	public List getListaProjetos() {
		return listaProjetos;
	}

	public void addListaProjetos(int idProjeto) {
		listaProjetos.add(idProjeto);
	}

	public List getListaProducaoAcademica() {
		return listaProducaoAcademica;
	}

	public void addListaProducaoAcademica(int idListaProducaoAcademica) {
		listaProducaoAcademica.add(idListaProducaoAcademica);
	}
	
	public String imprimir() {
		// Percorrer as listas e concatenar em uma string para exibir junto de nome e email.
		
		return "";
	}
	
}
