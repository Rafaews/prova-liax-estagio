package testeAssociado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Associado;
import dao.AssociadoDAO;

public class Teste {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws ParseException {
		System.out.println("CADASTRO DE ASSOCIADOS JAVA");        
        System.out.println("1. Cadastrar novo associado");
        System.out.println("2. Atualizar dado de associado");
        System.out.println("3. Apagar associado");
        System.out.println("4. Listar todos associados");
        System.out.println("5. Exit the program");
        System.out.println("");
        System.out.print("Selecione uma op��o de 1-5\r\n");
                       
        try {
            int input = Integer.parseInt(br.readLine());
            
            switch(input) {
            case 1:
            	 System.out.println("Voc� escolheu a op��o " + input + "\r\n");
            	 CadastrarAssociado();
              break;
            case 2:
            	System.out.println("Voc� escolheu a op��o " + input + "\r\n");
            	AlterarAssociado();
              break;
            case 3:
            	System.out.println("Voc� escolheu a op��o " + input + "\r\n");
            	ApagarAssociado();
                break;
            case 4:
            	System.out.println("Voc� escolheu a op��o " + input + "\r\n");
            	ListarAssociados();
                break;
            case 5:
            	 System.out.println("O programa ser� finalizado\r\n");
                 System.exit(1);
                break;
            default:
            	System.out.println("Voc� inseriu uma op��o invalida\r\n");
          }
            
        } catch (IOException ioe) {
            System.out.println("Erro ao inserir valor!\r\n");
            System.exit(1);
        }
	}
	
	
   public static void CadastrarAssociado() throws IOException, ParseException {
	   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	   
	   Associado associado = new Associado();
	   
	   System.out.println("N�mera��o de carteirinha : \r\n");
	   associado.setCd_associado(Long.parseLong(br.readLine()));
	   System.out.println("Nome do associado : \r\n");
	   associado.setNm_associado(br.readLine());
	   System.out.println("Data de nascimento (dd/mm/aaaa) : \r\n");	   
	   associado.setDt_nascimento(dateFormat.parse(br.readLine()));

	   
	   AssociadoDAO associadoDAO = new AssociadoDAO();
	   associadoDAO.save(associado); 
	   System.out.println("Associado cadastrado com sucesso!");
	   	   	   	  
   }
   
   public static void ApagarAssociado() throws IOException, ParseException { 
	   Associado associado = new Associado();
	   
	   System.out.println("Digite o c�digo do associado que deseja apagar : \r\n");
	   associado.setCd_associado(Long.parseLong(br.readLine()));
	   	  
	   AssociadoDAO associadoDAO = new AssociadoDAO();
	   associadoDAO.deleteById(associado.getCd_associado());
	   System.out.println("Associado apagado com sucesso!");
	   	   	   	  
   }
   
   public static void AlterarAssociado() throws IOException, ParseException { 
	   Associado associado = new Associado();
	   
	   System.out.println("Digite o c�digo do associado que deseja Alterar : \r\n");
	   associado.setCd_associado(Long.parseLong(br.readLine()));
	   System.out.println("Associado alterado com sucesso!");
	   	  	   	   	   	 
   }
   
   public static void ListarAssociados() throws IOException, ParseException { 
	   AssociadoDAO associadoDAO = new AssociadoDAO();
	   
		for (Associado assoc : associadoDAO.getAssociados()) {

			System.out.println("Carteirinha: " + assoc.getCd_associado());
			System.out.println("Nome: " + assoc.getNm_associado());
			// continuar..
		}
	   
	   	  	   	   	   	 
   }

}
