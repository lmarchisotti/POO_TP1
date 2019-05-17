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
	        System.out.println("| 7 - Cadastrar Publicação           |");
	        System.out.println("======================================");
	        System.out.println("| 8 - Consulta por Colaborador       |");
	        System.out.println("| 9 - Consulta por Projeto           |");
	        System.out.println("| 10 - Relatório de Produção do Lab. |");
	        System.out.println("======================================");
	        System.out.println("| 0 - Sair                           |");
	        System.out.println("======================================");
	        
	        System.out.println("Escolha uma opcão: ");
	        
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
	            	cadastrarPublicacao();
	            	break;
	            case 8 :
	            	consultaColaborador();
	            	break;
	            case 9 :
	            	consultaProjeto();
	            	break;
	            case 10:
	            	relatorioProducao();
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
		System.out.println("0. Sair");
		int opcao = ler.nextInt();
		
		switch ( opcao ) {
		case 0:
			break;
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
		
		if (id >= listaColaboradores.size()) {
			if (listaColaboradores.size() == 0) {
				System.out.println("Não há colaboradores cadastrados.");
			} else {
				System.out.println("ID inexistente.");
			}
		} else {
		
			Colaborador colaborador = (Colaborador)listaColaboradores.get(id);
			
			if (listaColaboradores.contains(colaborador)) {
				
				System.out.println("Nome: ");
				String nome = ler.next();
				System.out.println("Email: ");
				String email = ler.next();
				
				colaborador.setNome(nome);
				colaborador.setEmail(email);
				
			}
			
		}
		
	}
	
	public static void listarColaboradores() {
		
		if (listaColaboradores.size() > 0) {
			
			for (int i = 0; i < listaColaboradores.size(); i++) {
				Colaborador colaborador = (Colaborador)listaColaboradores.get(i);
				
				String conteudo = "ID: " + i + "|" + "Nome: " + colaborador.getNome() + "|" + "Email: " + colaborador.getEmail() + "|";
				
				if (colaborador instanceof Graduando) {
					conteudo = conteudo + "Tipo: Graduando" + "\n";
				} else {
					if (colaborador instanceof Mestrando) {
						conteudo = conteudo + "Tipo: Mestrando" + "\n";
					} else {
						if (colaborador instanceof Pesquisador) {
							conteudo = conteudo + "Tipo: Pesquisador" + "\n";
						} else {
							if (colaborador instanceof Professor) {
								conteudo = conteudo + "Tipo: Professor" + "\n";
							}
						}
					}
				}
				
				System.out.println(conteudo);
			}
			
		} else {
			System.out.println("Não há colaboradores cadastrados.");
		}
		
	}
	
	public static void cadastrarProjeto() {
		
		Projeto projeto = new Projeto();
		
		System.out.println("ID do Professor que será gerente deste projeto: ");
		int professor_gerente = ler.nextInt();
		
		if (professor_gerente >= listaColaboradores.size()) {
			
			if ((Colaborador)listaColaboradores.get(professor_gerente) instanceof Professor) {
				projeto.addParticipante(professor_gerente);
				projeto.setProfessorGerente(professor_gerente);
				
				System.out.println("Título: ");
				String titulo = ler.next();
				System.out.println("Objetivo: ");
				String objetivo = ler.next();
				System.out.println("Descrição: ");
				String descricao = ler.next();
				System.out.println("Financiadora: ");
				String financiadora = ler.next();
				System.out.println("Valor financiado: ");
				int valor_financiado = ler.nextInt();
				System.out.println("Data início: ");
				String data_ini = ler.next();
				System.out.println("Data término: ");
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
			
		}else {
			if (listaColaboradores.size() == 0) {
				System.out.println("Não há colaboradores cadastrados.");
			} else {
				System.out.println("ID inexistente.");
			}
		}

	}
	
	public static void editarProjeto() {
		
		System.out.println("ID do Projeto: ");
		int id = ler.nextInt();
		
		if (id >= listaProjetos.size()) {
		
			Projeto projeto = (Projeto)listaProjetos.get(id);
			
			System.out.println("ID do Professor gerente deste projeto: ");
			int id_profGerente = ler.nextInt();
			
			if (id_profGerente == projeto.getProfessorGerente()) {
				
				int op;
				do {
					System.out.println("Título: " + projeto.getTitulo() + "\n" +
										"Objetivo: " + projeto.getObjetivo() + "\n" +
										"Descrição: " + projeto.getDescricao() + "\n" +
										"Financiadora: " + projeto.getFinanciadora() + "\n" +
										"Valor financiado: " + projeto.getValor_financiado() + "\n" +
										"Data início: " + projeto.getData_ini() + "\n" +
										"Data término: " + projeto.getData_fim() + "\n" +
										"Status: " + projeto.getStatus() + "\n");
					System.out.println("Participantes: ");
					for (int i = 0; i < projeto.getListaParticipantes().size(); i++) {
						int participante = (int)projeto.getListaParticipantes().get(i);
						
						Colaborador colaborador = (Colaborador)listaColaboradores.get(participante);
						System.out.println("Nome: " + colaborador.getNome());
					}
					
					System.out.println("\n");
					System.out.println("O que deseja modificar?");
					System.out.println("1. Título");
					System.out.println("2. Objetivo");
					System.out.println("3. Descrição");
					System.out.println("4. Financiadora");
					System.out.println("5. Valor financiado");
					System.out.println("6. Data início");
					System.out.println("7. Data término");
					System.out.println("8. Status");
					System.out.println("9. Adicionar particiantes");
					System.out.println("0. Sair");
					op = ler.nextInt();
					
					switch ( op ) {
						case 1:
							System.out.println("Título: ");
							String titulo = ler.next();
							
							projeto.setTitulo(titulo);
							break;
						case 2:
							System.out.println("Objetivo: ");
							String objetivo = ler.next();
							
							projeto.setObjetivo(objetivo);
							break;
						case 3:
							System.out.println("Descrição: ");
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
							System.out.println("Data início (ano): ");
							String data_ini = ler.next();
							
							projeto.setData_ini(data_ini); // Converter string data, para tipo data
							break;
						case 7:
							System.out.println("Data término (ano): ");
							String data_fim = ler.next();
							
							projeto.setData_fim(data_fim); // Converter string data, para tipo data
							break;
						case 8:
							// Deve testar se todos os campos estão preenchidos antes de alterar
							// (Perguntar para o Elder se esse teste não é inútil, já que é impossível - dado a maneira que foi feito esse código - não preencher todos os campos)
							
							System.out.println("Status: ");
							System.out.println("1. Em andamento");
							System.out.println("2. Concluído");
							int status = ler.nextInt();
							
							if (status == 1) {
								projeto.setStatus("Em andamento");
							} else {
								
								if (status == 2) {
									int verifica = 0;
									for (int i = 0; i < projeto.getListaParticipantes().size(); i++) {
										int participante = (int)projeto.getListaParticipantes().get(i);
										
										Colaborador colaborador = (Colaborador)listaColaboradores.get(participante);
										
										for (int j = 0; j < colaborador.getProducaoAcademica().getListaPublicacoes().size(); j++) {
											Publicacao publicacao = (Publicacao)colaborador.getProducaoAcademica().getListaPublicacoes().get(j);
											
											if (publicacao.getIdProjeto() == id) {
												projeto.setStatus("Concluído");
												verifica = 1;
												break;
											} else {
												verifica = 0;
											}
										}
										
										if (verifica == 0) {
											System.out.println("Não há publicações associadas ao projeto.");
										}
									}
								}
								
							}
							break;
						case 9:
							if (projeto.getStatus() == "Em elaboração") {
								System.out.println("1. Graduando");
								System.out.println("2. Mestrando");
								System.out.println("3. Pesquisador");
								System.out.println("4. Professor");
								System.out.println("0. Sair");
								
								int op2 = ler.nextInt();
								
								switch ( op2 ) {
									case 0:
										break;
									case 1:
										System.out.println("ID do Graduando: ");
										int graduando = ler.nextInt();
										
										if (graduando >= listaColaboradores.size()) {
											
											int numProjetos = 0;
											for (int i = 0; i < listaProjetos.size(); i++) {
												Projeto p = (Projeto)listaProjetos.get(i);
												if(p.getStatus() == "Em andamento" && p.getListaParticipantes().contains(graduando)) {
													numProjetos = numProjetos + 1;
												}
	 										}
											
											if (numProjetos < 2) {
												if (listaColaboradores.contains((Colaborador)listaColaboradores.get(graduando))) {
													if ((Colaborador)listaColaboradores.get(graduando) instanceof Graduando) {
														projeto.addParticipante(graduando);
														
														Colaborador colaborador = (Colaborador)listaColaboradores.get(graduando);
														colaborador.addListaProjetos(id);
													} else {
														System.out.println("Este colaborador não é um Graduando.");
													}
												} else {
													System.out.println("ID inexistente.");
												}
											} else {
												System.out.println("Este graduando já está em 2 projetos 'Em andamento'.");
											}
											
										} else {
											if (listaProjetos.size() == 0) {
												System.out.println("Não há colaboradores cadastrados.");
											} else {
												System.out.println("Projeto inexistente.");
											}
										}
										break;
									case 2:
										System.out.println("ID do Mestrando: ");
										int mestrando = ler.nextInt();
										
										if (mestrando >= listaColaboradores.size()) {
										
											if (listaColaboradores.contains((Colaborador)listaColaboradores.get(mestrando))) {
												if ((Colaborador)listaColaboradores.get(mestrando) instanceof Mestrando) {
													projeto.addParticipante(mestrando);
													
													Colaborador colaborador = (Colaborador)listaColaboradores.get(mestrando);
													colaborador.addListaProjetos(id);
												} else {
													System.out.println("Este colaborador não é um Mestrando.");
												}
											} else {
												System.out.println("ID inexistente.");
											}
										} else {
											if (listaProjetos.size() == 0) {
												System.out.println("Não há colaboradores cadastrados.");
											} else {
												System.out.println("Projeto inexistente.");
											}
										}
										break;
									case 3:
										System.out.println("ID do Pesquisador: ");
										int pesquisador = ler.nextInt();
										
										if (pesquisador >= listaColaboradores.size()) {
											
											if (listaColaboradores.contains((Colaborador)listaColaboradores.get(pesquisador))) {
												if ((Colaborador)listaColaboradores.get(pesquisador) instanceof Pesquisador) {
													projeto.addParticipante(pesquisador);
													
													Colaborador colaborador = (Colaborador)listaColaboradores.get(pesquisador);
													colaborador.addListaProjetos(id);
												} else {
													System.out.println("Este colaborador não é um Pesquisador.");
												}
											} else {
												System.out.println("ID inexistente.");
											}
										} else {
											if (listaProjetos.size() == 0) {
												System.out.println("Não há colaboradores cadastrados.");
											} else {
												System.out.println("Projeto inexistente.");
											}
										}
										break;
									case 4:
										System.out.println("ID do Professor: ");
										int professor = ler.nextInt();
										
										if (professor >= listaColaboradores.size()) {
											
											if (listaColaboradores.contains((Colaborador)listaColaboradores.get(professor))) {
												if ((Colaborador)listaColaboradores.get(professor) instanceof Professor) {
													projeto.addParticipante(professor);
													
													Colaborador colaborador = (Colaborador)listaColaboradores.get(professor);
													colaborador.addListaProjetos(id);
												} else {
													System.out.println("Este colaborador não é um Professor.");
												}
											} else {
												System.out.println("ID inexistente.");
											}
										} else {
											if (listaProjetos.size() == 0) {
												System.out.println("Não há colaboradores cadastrados.");
											} else {
												System.out.println("Projeto inexistente.");
											}
										}
										break;
								}
							} else {
								System.out.println("Projeto não está no estágio de 'Em elaboração'.");
							}
							break;
					}
				}while (op != 0);
				
			} else {
				System.out.println("Não é o professor gerente deste projeto.");
			}
			
		} else {
			if (listaProjetos.size() == 0) {
				System.out.println("Não existem projetos cadastrados.");
			} else {
				System.out.println("Projeto inexistente.");
			}
		}
		
	}
	
	public static void listarProjetos() {
		
		if (listaProjetos.size() > 0) {
			
			for (int i = 0; i < listaProjetos.size(); i++) {
				Projeto projeto = (Projeto)listaProjetos.get(i);
				
				System.out.println("ID: " + i + "|" + "Titulo: " + projeto.getTitulo() + "|" + "Status: " + projeto.getStatus());
			}
			
		} else {
			System.out.println("Não há projetos cadastrados.");
		}
		
	}
	
	public static void cadastrarPublicacao() {
		
		System.out.println("Digite a ID do projeto: ");
		int idProjeto = ler.nextInt();
		
		if (idProjeto >= listaProjetos.size()) {
			
			Projeto projeto = (Projeto)listaProjetos.get(idProjeto);
			
			if (projeto.getStatus() == "Em andamento") {
			
				System.out.println("Orientador: ");
				int orientador = ler.nextInt();
				
				if (listaColaboradores.contains((Colaborador)listaColaboradores.get(orientador))) {
					
					if ((Colaborador)listaColaboradores.get(orientador) instanceof Professor) {
						
						System.out.println("ID do Orientando: ");
						int orientando = ler.nextInt();
						System.out.println("Título: ");
						String titulo = ler.next();
						System.out.println("Conferência: ");
						String conferencia = ler.next();
						System.out.println("Ano");
						int ano = ler.nextInt();
						
						Publicacao publicacao = new Publicacao();
						
						publicacao.setTitulo(titulo);
						publicacao.setConferencia(conferencia);
						publicacao.setAno(ano);
						publicacao.setIdProjeto(idProjeto);
						publicacao.setOrientador(orientador);
						
						Colaborador colaborador_orientando = (Colaborador)listaColaboradores.get(orientando);
						colaborador_orientando.getProducaoAcademica().addListaPublicacoes(publicacao);
						
						Colaborador colaborador_orientador = (Colaborador)listaColaboradores.get(orientador);
						colaborador_orientador.getProducaoAcademica().addListaPublicacoes(publicacao);
						colaborador_orientador.getProducaoAcademica().addListaOrientacoes(orientando);
						
					} else {
						System.out.println("Este colaborador não é um Professor.");
					}
					
				}else {
					if (listaColaboradores.size() == 0) {
						System.out.println("Não há colaboradores cadastrados.");
					} else {
						System.out.println("ID inexistente.");
					}
				}
				
			} else {
				System.out.println("Este projeto não está 'Em andamento'.");
			}
			
		} else {
			if (listaProjetos.size() == 0) {
				System.out.println("Não existem projetos cadastrados.");
			} else {
				System.out.println("Projeto inexistente.");
			}
		}
		
	}
	
	public static void consultaColaborador() {
		
		System.out.println("Digite o ID do colaborador: ");
		int idColaborador = ler.nextInt();
		
		if (idColaborador >= listaColaboradores.size()) {
		
			Colaborador colaborador = (Colaborador)listaColaboradores.get(idColaborador);
			
			if (listaColaboradores.contains(colaborador)) {
				
				System.out.println("Nome: " + colaborador.getNome());
				System.out.println("Email: " + colaborador.getEmail() + "\n");
				
				System.out.println("PROJETOS");
				for (int j = 0; j < colaborador.getListaProjetos().size(); j++) {
					
					Projeto projeto = (Projeto)listaProjetos.get((int)colaborador.getListaProjetos().get(j));
					System.out.println("Título: " + projeto.getTitulo() + "\n" +
										"Objetivo: " + projeto.getObjetivo() + "\n" +
										"Descrição: " + projeto.getDescricao() + "\n" +
										"Financiadora: " + projeto.getFinanciadora() + "\n" +
										"Valor financiado: " + projeto.getValor_financiado() + "\n" +
										"Data início: " + projeto.getData_ini() + "\n" +
										"Data término: " + projeto.getData_fim() + "\n" +
										"Status: " + projeto.getStatus() + "\n");
					
				}
				
				System.out.println("PRODUÇÃO ACADÊMICA");
				System.out.println("Publicações: \n");
				for (int j = 0; j < colaborador.getProducaoAcademica().getListaPublicacoes().size(); j++) {
					
					Publicacao publicacao = (Publicacao)colaborador.getProducaoAcademica().getListaPublicacoes().get(j);
					String conteudo = "Título: " + publicacao.getTitulo() + "\n" +
										"Conferência: " + publicacao.getConferencia() + "\n" +
										"Ano: " + publicacao.getAno() + "\n";
					Projeto tituloProjeto = (Projeto)listaProjetos.get((int)publicacao.getIdProjeto());
					conteudo = conteudo + "Projeto: " + tituloProjeto.getTitulo() + "\n";
					Colaborador orientador = (Colaborador)listaColaboradores.get((int)publicacao.getOrientador());					
					conteudo = conteudo + "Orientador: " + orientador.getNome() + "\n";
					
					System.out.println(conteudo);
					
				}
				
				if (colaborador instanceof Professor) {
					
					System.out.println("Orientações: \n");
					for (int j = 0; j < colaborador.getProducaoAcademica().getListaOrientacoes().size(); j++) {
						
						int idOrientando = (int)colaborador.getProducaoAcademica().getListaOrientacoes().get(j);
						Colaborador orientando = (Colaborador)listaColaboradores.get(idOrientando);
						
						System.out.println("Nome: " + orientando.getNome() + "\n");
					}
					
				}
				
			} else {
				System.out.println("Colaborador não encontrado ou não cadastrado.");
			}
			
		} else {
			if (listaProjetos.size() == 0) {
				System.out.println("Não há colaboradores cadastrados.");
			} else {
				System.out.println("Projeto inexistente.");
			}
		}
		
	}
	
	public static void consultaProjeto() {
		
		System.out.println("Digite o ID do projeto: ");
		int idProjeto = ler.nextInt();
		
		if (idProjeto >= listaProjetos.size()) {
		
			Projeto projeto = (Projeto)listaProjetos.get(idProjeto);

			System.out.println("Título: " + projeto.getTitulo() + "\n" +
					"Objetivo: " + projeto.getObjetivo() + "\n" +
					"Descrição: " + projeto.getDescricao() + "\n" +
					"Financiadora: " + projeto.getFinanciadora() + "\n" +
					"Valor financiado: " + projeto.getValor_financiado() + "\n" +
					"Data início: " + projeto.getData_ini() + "\n" +
					"Data término: " + projeto.getData_fim() + "\n" +
					"Status: " + projeto.getStatus() + "\n");
			System.out.println("Participantes: ");
			
			for (int i = 0; i < projeto.getListaParticipantes().size(); i++) {
				int participante = (int)projeto.getListaParticipantes().get(i);
			
				Colaborador colaborador = (Colaborador)listaColaboradores.get(participante);
				System.out.println("Nome: " + colaborador.getNome());
				
				System.out.println("PRODUÇÃO ACADÊMICA");
				System.out.println("Publicações: \n");
				for (int j = 0; j < colaborador.getProducaoAcademica().getListaPublicacoes().size(); j++) {
					
					Publicacao publicacao = (Publicacao)colaborador.getProducaoAcademica().getListaPublicacoes().get(j);
					String conteudo = "Título: " + publicacao.getTitulo() + "\n" +
										"Conferência: " + publicacao.getConferencia() + "\n" +
										"Ano: " + publicacao.getAno() + "\n";
					Projeto tituloProjeto = (Projeto)listaProjetos.get((int)publicacao.getIdProjeto());
					conteudo = conteudo + "Projeto: " + tituloProjeto.getTitulo() + "\n";
					Colaborador orientador = (Colaborador)listaColaboradores.get((int)publicacao.getOrientador());					
					conteudo = conteudo + "Orientador: " + orientador.getNome() + "\n";
					
					System.out.println(conteudo);
					
				}
				
				if ((Colaborador)listaColaboradores.get(participante) instanceof Professor) {
					
					System.out.println("Orientações: \n");
					for (int j = 0; j < colaborador.getProducaoAcademica().getListaOrientacoes().size(); j++) {
						
						int idOrientando = (int)colaborador.getProducaoAcademica().getListaOrientacoes().get(j);
						Colaborador orientando = (Colaborador)listaColaboradores.get(idOrientando);
						
						System.out.println("Nome: " + orientando.getNome() + "\n");
					}
					
				}
				
			}
			
		} else {
			if (listaProjetos.size() == 0) {
				System.out.println("Não existem projetos cadastrados.");
			} else {
				System.out.println("Projeto inexistente.");
			}
		}
		
	}
	
	public static void relatorioProducao() {
		
		System.out.println("Relatório de produção do laboratório.");
		System.out.println("Número de colaboradores: " + listaColaboradores.size());
		System.out.println("Número total de projetos: " + listaProjetos.size());
		
		int numProjetoElaboracao = 0;
		int numProjetoAndamento = 0;
		int numProjetoConluido = 0;
		for (int i = 0; i < listaProjetos.size(); i++) {
			
			Projeto projeto = (Projeto)listaProjetos.get(i);
			if (projeto.getStatus() == "Em elaboração") {
				numProjetoElaboracao = numProjetoElaboracao + 1;
			} else {
				if (projeto.getStatus() == "Em andamento") {
					numProjetoAndamento = numProjetoAndamento + 1;
				} else {
					if (projeto.getStatus() == "Concluído") {
						numProjetoConluido = numProjetoConluido + 1;
					}
				}
			}
			
		}
		
		System.out.println("Número de projetos em elaboração: " + numProjetoElaboracao);
		System.out.println("Número de projetos em elaboração: " + numProjetoAndamento);
		System.out.println("Número de projetos em elaboração: " + numProjetoConluido);
		
		int somaPublicacoes = 0;
		int somaOrientacoes = 0;
		for (int i = 0; i < listaColaboradores.size(); i++) {
			
			Colaborador colaborador = (Colaborador)listaColaboradores.get(i);
			
			somaPublicacoes = somaPublicacoes + colaborador.getProducaoAcademica().getListaPublicacoes().size();
			
			if (colaborador instanceof Professor || colaborador instanceof Pesquisador) {
				somaOrientacoes = somaOrientacoes + colaborador.getProducaoAcademica().getListaOrientacoes().size();
			}
			
		}
		
		System.out.println("Número de produção acadêmica por tipo de produção.");
		System.out.println("Publicações: " + somaPublicacoes);
		System.out.println("Orientacoes: " + somaOrientacoes);
		
	}
	
}
