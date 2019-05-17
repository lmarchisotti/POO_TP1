import java.util.*;

public class Colaborador {

	private List listaProjetos = new ArrayList();
	ProducaoAcademica producaoAcademica = new ProducaoAcademica();
	
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

	public ProducaoAcademica getProducaoAcademica() {
		return producaoAcademica;
	}
	
}
