
public class Publicacao extends ProducaoAcademica {
	
	private String titulo, conferencia;
	private int idProjeto, ano, orientador;
	
	public int getOrientador() {
		return orientador;
	}
	
	public void setOrientador(int orientador) {
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
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getIdProjeto() {
		return idProjeto;
	}
	
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	
}
