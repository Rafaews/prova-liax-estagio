package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        System.out.print("Selecione uma opção de 1-5\r\n");
        
        
        
        try {
            int input = Integer.parseInt(br.readLine());
            
            switch(input) {
            case 1:
            	 System.out.println("Você escolheu a opção " + input + "\r\n");
            	 CadastrarAssociado();
              break;
            case 2:
            	System.out.println("Você escolheu a opção " + input + "\r\n");
              break;
            case 3:
            	System.out.println("Você escolheu a opção " + input + "\r\n");
                break;
            case 4:
            	System.out.println("Você escolheu a opção " + input + "\r\n");
                break;
            case 5:
            	 System.out.println("O programa será finalizado\r\n");
                 System.exit(1);
                break;
            default:
            	System.out.println("Você inseriu uma opção invalida\r\n");
          }
            
        } catch (IOException ioe) {
            System.out.println("Erro ao inserir valor!\r\n");
            System.exit(1);
        }
	}
	
	
   public static void CadastrarAssociado() throws IOException, ParseException {
	   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	   
	   Associado associado = new Associado();
	   
	   System.out.println("Númeração de carteirinha : \r\n");
	   associado.setCd_associado(Long.parseLong(br.readLine()));
	   System.out.println("Nome do associado : \r\n");
	   associado.setNm_associado(br.readLine());
	   System.out.println("Data de nascimento (dd/mm/aaaa) : \r\n");	   
	   associado.setDt_nascimento(dateFormat.parse(br.readLine()));

	   
	   AssociadoDAO associadoDAO = new AssociadoDAO();
	   associadoDAO.save(associado);
	   	   	   	  
   }

}
