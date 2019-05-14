// import java.io.Console;
import java.util.*;

public class Laboratorio {

	static List listaColaboradores = new ArrayList();
	static List listaProjetos = new ArrayList();
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao;
		
		do {

			System.out.println("======================================");
			System.out.println("| 1 - Cadastrar Colaborador          |");
	        System.out.println("| 2 - Editar Colaborador             |");
	        System.out.println("| 3 - Listar Colaboradores           |");
	        System.out.println("|------------------------------------|");
	        System.out.println("| 4 - Cadastrar Projeto              |");
	        System.out.println("| 5 - Editar Projeto                 |");
	        System.out.println("| 6 - Listar Projetos                |");
	        System.out.println("|------------------------------------|");
	        System.out.println("| 7 - Cadastrar Publicacao           |");
	        System.out.println("| 8 - Editar Publicacao              |");
	        System.out.println("======================================");
	        System.out.println("| 9 - Consulta por Colaborador       |");
	        System.out.println("| 10 - Consulta por Projeto           |");
	        System.out.println("| 11 - Relatorio de Producao do Lab. |");
	        System.out.println("======================================");
	        System.out.println("| 0 - Sair                           |");
	        System.out.println("======================================");

	        System.out.println("Escolha uma opcao: ");
	        
	        opcao = ler.nextInt();
	        // opcao = Integer.parseInt(Console.readLine());

	        switch ( opcao ) {
	            case 1 :
	            	cadastrarColaborador();
	                break;
	            case 2 :
	            	editarColaborador();
	                break;
	            case 3 :
	            	listarColaboradores();
	                break;
	            case 4 :
	            	cadastrarProjeto();
	                break;	          
	            case 5 :
	            	editarProjeto();
	                break;
	            case 6 :
	            	listarProjetos();
	                break;	          
	            case 7 :

	            	break;
	            case 8 :

	            	break;
	            case 9 :

	            	break;
	            case 10:
	            	
	            	break;
	            case 11:
	            	
	            	break;

	        }

	    } while( opcao != 0 );

	}

	public static void cadastrar(Colaborador colaborador) {
		
		System.out.println("Nome: ");
		String nome = ler.next();
		System.out.println("Email: ");
		String email = ler.next();
		
		colaborador.setNome(nome);
		colaborador.setEmail(email);
	    
		listaColaboradores.add(colaborador);
		
		System.out.println("Cadastrado com sucesso. ID: " + listaColaboradores.lastIndexOf(colaborador) + "\n");

	}
	
	public static void cadastrarColaborador() {
		
		System.out.println("1. Graduando");
		System.out.println("2. Mestrando");
		System.out.println("3. Pesquisador");
		System.out.println("4. Professor");

		int opcao = ler.nextInt();
		
		switch ( opcao ) {
			case 1:
				Graduando graduando = new Graduando();
				cadastrar(graduando);
				break;
			case 2:
				Mestrando mestrando= new Mestrando();
				cadastrar(mestrando);
				break;
			case 3:
				Pesquisador pesquisador = new Pesquisador();
				cadastrar(pesquisador);
				break;
			case 4:
				Professor professor = new Professor();
				cadastrar(professor);
				break;
		}
		
	}
	
	public static void editarColaborador() {
		
		System.out.println("Digite a ID do Colaborador: ");
		int id = ler.nextInt();
		
		Colaborador colaborador = (Colaborador)listaColaboradores.get(id);
		
		System.out.println("Nome: ");
		String nome = ler.next();
		System.out.println("Email: ");
		String email = ler.next();
		
		colaborador.setNome(nome);
		colaborador.setEmail(email);
		
	}
	
	public static void listarColaboradores() {
		
		if (listaColaboradores.size() > 0) {
			for (int i = 0; i < listaColaboradores.size(); i++) {
				Colaborador colaborador = (Colaborador)listaColaboradores.get(i);
				
				System.out.println("ID: " + i + "|" + "Nome: " + colaborador.getNome() + "\n");
			}
		} else {
			System.out.println("Não há colaboradores cadastrados.");
		}
		
	}
	
	public static void cadastrarProjeto() {
		
		Projeto projeto = new Projeto();
		
		System.out.println("ID do Professor gerente: ");
		int professor_gerente = ler.nextInt();
		
		if ((Colaborador)listaColaboradores.get(professor_gerente) instanceof Professor) {
			projeto.addParticipante(professor_gerente);
			projeto.setProfessorGerente(professor_gerente);
			
			System.out.println("Titulo: ");
			String titulo = ler.next();
			System.out.println("Objetivo: ");
			String objetivo = ler.next();
			System.out.println("Descricao: ");
			String descricao = ler.next();
			System.out.println("Financiadora: ");
			String financiadora = ler.next();
			System.out.println("Valor financiado: ");
			int valor_financiado = ler.nextInt();
			System.out.println("Data inicio: ");
			String data_ini = ler.next();
			System.out.println("Data termino: ");
			String data_fim = ler.next();
			
			projeto.setTitulo(titulo);
			projeto.setObjetivo(objetivo);
			projeto.setDescricao(descricao);
			projeto.setFinanciadora(financiadora);
			projeto.setValor_financiado(valor_financiado);
			projeto.setData_ini(data_ini);
			projeto.setData_fim(data_fim);
			projeto.setStatus("Em elaboração");
			
			listaProjetos.add(projeto);
			
			Colaborador colaborador = (Colaborador)listaColaboradores.get(professor_gerente);
			colaborador.addListaProjetos(listaProjetos.lastIndexOf(projeto));
		} else {
			System.out.println("Este colaborador não é um Professor.");
		}

	}
	
	public static void editarProjeto() {
		
		System.out.println("ID do Projeto: ");
		int id = ler.nextInt();
		
		Projeto projeto = (Projeto)listaProjetos.get(id);
		
		if (projeto != null) {
			
			System.out.println("ID do Professor gerente deste projeto: ");
			int id_profGerente = ler.nextInt();
			
			if (id_profGerente == projeto.getProfessorGerente()) {
				
				int op;
				do {
					System.out.println("Titulo: " + projeto.getTitulo() + "\n" +
										"Objetivo: " + projeto.getObjetivo() + "\n" +
										"Descricao: " + projeto.getDescricao() + "\n" +
										"Financiadora: " + projeto.getFinanciadora() + "\n" +
										"Valor financiado: " + projeto.getValor_financiado() + "\n" +
										"Data inicio: " + projeto.getData_ini() + "\n" +
										"Data termino: " + projeto.getData_fim() + "\n" +
										"Status: " + projeto.getStatus() + "\n");
					System.out.println("Participantes: ");
					for (int i = 0; i < projeto.getListaParticipantes().size(); i++) {
						int participante = (int)projeto.getListaParticipantes().get(i);
						
						Colaborador colaborador = (Colaborador)listaColaboradores.get(participante);
						System.out.println("Nome: " + colaborador.getNome() + " ");
					}
					
					System.out.println("\n");
					System.out.println("O que deseja modificar?");
					System.out.println("1. Titulo");
					System.out.println("2. Objetivo");
					System.out.println("3. Descricao");
					System.out.println("4. Financiadora");
					System.out.println("5. Valor financiado");
					System.out.println("6. Data inicio");
					System.out.println("7. Data termino");
					System.out.println("8. Status");
					System.out.println("9. Adicionar particiantes");
					System.out.println("0. Sair");
					op = ler.nextInt();
					
					switch ( op ) {
						case 1:
							System.out.println("Titulo: ");
							String titulo = ler.next();
							
							projeto.setTitulo(titulo);
							break;
						case 2:
							System.out.println("Objetivo: ");
							String objetivo = ler.next();
							
							projeto.setObjetivo(objetivo);
							break;
						case 3:
							System.out.println("Descricao: ");
							String descricao = ler.next();
							
							projeto.setDescricao(descricao);
							break;
						case 4:
							System.out.println("Financiadora: ");
							String financiadora = ler.next();
							
							projeto.setFinanciadora(financiadora);
							break;
						case 5:
							System.out.println("Valor financiado: ");
							int valor_financiado = ler.nextInt();
							
							projeto.setValor_financiado(valor_financiado);
							break;
						case 6:
							System.out.println("Data inicio: ");
							String data_ini = ler.next();
							
							projeto.setData_ini(data_ini);
							break;
						case 7:
							System.out.println("Data termino: ");
							String data_fim = ler.next();
							
							projeto.setData_fim(data_fim);
							break;
						case 8:
							// Deve testar se todos os campos estão preenchidos antes de alterar
							// (Perguntar para o Elder se esse teste não é inútil, já que é impossível - dado a maneira que foi feito esse código - não preencher todos os campos)
							
							System.out.println("Status: ");
							String status = ler.next();
							
							projeto.setStatus(status);
							break;
						case 9:
							System.out.println("1. Graduando");
							System.out.println("2. Mestrando");
							System.out.println("3. Pesquisador");
							System.out.println("4. Professor");
							op = ler.nextInt();
							switch ( op ) {
								case 1:
									System.out.println("ID do Graduando: ");
									int graduando = ler.nextInt();
									
									if ((Colaborador)listaColaboradores.get(graduando) instanceof Graduando) {
										projeto.addParticipante(graduando);
										
										Colaborador colaborador = (Colaborador)listaColaboradores.get(graduando);
										colaborador.addListaProjetos(id);
									} else {
										System.out.println("Este colaborador não é um Graduando.");
									}
									break;
								case 2:
									System.out.println("ID do Mestrando: ");
									int mestrando = ler.nextInt();
									
									if ((Colaborador)listaColaboradores.get(mestrando) instanceof Mestrando) {
										projeto.addParticipante(mestrando);
										
										Colaborador colaborador = (Colaborador)listaColaboradores.get(mestrando);
										colaborador.addListaProjetos(id);
									} else {
										System.out.println("Este colaborador não é um Mestrando.");
									}
									break;
								case 3:
									System.out.println("ID do Pesquisador: ");
									int pesquisador = ler.nextInt();
									
									if ((Colaborador)listaColaboradores.get(pesquisador) instanceof Pesquisador) {
										projeto.addParticipante(pesquisador);
										
										Colaborador colaborador = (Colaborador)listaColaboradores.get(pesquisador);
										colaborador.addListaProjetos(id);
									} else {
										System.out.println("Este colaborador não é um Pesquisador.");
									}
									break;
								case 4:
									System.out.println("ID do Professor: ");
									int professor = ler.nextInt();
									
									if ((Colaborador)listaColaboradores.get(professor) instanceof Professor) {
										projeto.addParticipante(professor);
										
										Colaborador colaborador = (Colaborador)listaColaboradores.get(professor);
										colaborador.addListaProjetos(id);
									} else {
										System.out.println("Este colaborador não é um Professor.");
									}
									break;
							}
							break;
					}
				}while (op != 0);
				
			}else {
				System.out.println("Professor gerente incorreto.");
			}
			
		}
		
	}
	
	public static void listarProjetos() {
		
		if (listaColaboradores.size() > 0) {
			for (int i = 0; i < listaColaboradores.size(); i++) {
				Projeto projeto = (Projeto)listaProjetos.get(i);
				
				System.out.println("ID: " + i + "|" + "Titulo: " + projeto.getTitulo() + "\n");
			}
		} else {
			System.out.println("Não há projetos cadastrados.");
		}
		
		
	}
	
}
