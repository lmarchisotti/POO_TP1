import java.util.*;

public class Publicacao extends ProducaoAcademica {

	private List listaParticipantes = new ArrayList();
	
	private String titulo, conferencia, ano, orientador;
	private int idProjeto;
	
	public List getListaParticipantes() {
		return listaParticipantes;
	}

	public void addParticipante(int idColaborador) {
		listaParticipantes.add(idColaborador);
	}
	
	public String getOrientador() {
		return orientador;
	}
	
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getConferencia() {
		return conferencia;
	}
	
	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public int getIdProjeto() {
		return idProjeto;
	}
	
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	
}
