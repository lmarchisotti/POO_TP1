import java.util.*;

public class Projeto {

	private static List listaParticipantes = new ArrayList();
	
	private String titulo, financiadora, objetivo, descricao, data_ini, data_fim, status;
	private int valor_financiado, professorGerente;
	
	public int getProfessorGerente() {
		return professorGerente;
	}
	
	public void setProfessorGerente(int professorGerente) {
		this.professorGerente = professorGerente;
	}
	
	public List getListaParticipantes() {
		return listaParticipantes;
	}

	public void addParticipante(Colaborador colaborador) {
		listaParticipantes.add(colaborador);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getFinanciadora() {
		return financiadora;
	}
	
	public void setFinanciadora(String financiadora) {
		this.financiadora = financiadora;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getData_ini() {
		return data_ini;
	}
	
	public void setData_ini(String data_ini) {
		this.data_ini = data_ini;
	}
	
	public String getData_fim() {
		return data_fim;
	}
	
	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getValor_financiado() {
		return valor_financiado;
	}
	
	public void setValor_financiado(int valor_financiado) {
		this.valor_financiado = valor_financiado;
	}
	
}
