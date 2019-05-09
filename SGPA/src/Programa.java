// import java.io.Console;
import java.util.Scanner;

public class Programa {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao;
		
		do {

			System.out.println("=====================================");
			System.out.println("| 1 - Cadastrar Colaborador         |");
	        System.out.println("| 2 - Editar Colaborador            |");
	        System.out.println("|-----------------------------------|");
	        System.out.println("| 3 - Cadastrar Projeto             |");
	        System.out.println("| 4 - Editar Projeto                |");
	        System.out.println("|-----------------------------------|");
	        System.out.println("| 5 - Cadastrar Publicacao          |");
	        System.out.println("| 6 - Editar Publicacao             |");
	        System.out.println("=====================================");
	        System.out.println("| 7 - Consulta por Colaborador      |");
	        System.out.println("| 8 - Consulta por Projeto          |");
	        System.out.println("| 9 - Relatorio de Producao do Lab. |");
	        System.out.println("=====================================");
	        System.out.println("| 0 - Sair                          |");
	        System.out.println("=====================================");

	        System.out.println("Escolha uma opcao: ");
	        
	        opcao = ler.nextInt();
	        // opcao = Integer.parseInt(Console.readLine());

	        switch ( opcao ) {
	            case 1 :
	            	cadastrarColaborador();
	                break;
	            case 2 :
	            	
	                break;
	            case 3 :
	            	
	                break;
	            case 4 :
	            	
	                break;	          
	            case 5 :
	            	
	                break;
	            case 6 :
	            	
	                break;	          
	            case 7 :
	            	
	            	break;
	            case 8 :
	            	
	            	break;
	            case 9 :
	            	
	            	break;
	            	            
	        }

	    } while( opcao != 0 );		
	}

	public static void cadastrarColaborador() {
		
		System.out.println("Nome: ");
		String nome = ler.next();
		System.out.println("Email: ");
		String email = ler.next();
		
		// Lista de projetos
		// Lista de publicações
		
		// 
		
	}
	
}
