package testeIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class IOOO {

	public static void main(String[] args) throws IOException {
		InputStream teste = System.in;
		InputStreamReader teste1 = new InputStreamReader(teste);
		BufferedReader ler = new BufferedReader(teste1);
		
		System.out.println("Digite sua mensagem: ");
		System.out.println(ler.readLine());
		
		ler.close();
		
		/*código professor
		
		InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Digite sua mensagem:");
        String linha = br.readLine(); // primeira linha

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();*/
        
        //outra opção!
        
        InputStream teste2 = new FileInputStream("ler.txt");
		InputStreamReader teste3 = new InputStreamReader(teste2);
		BufferedReader ler1 = new BufferedReader(teste3);
		
		//OPção2
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));

		//String linha = br.readLine(); // primeira linha
	
		System.out.println(ler1.readLine());
		
		ler1.close();
	
		/* código do professor
		 *  InputStream is = new FileInputStream("arquivo.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Digite sua mensagem:");
            String linha = br.readLine(); // primeira linha

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
            br.close();
            //OPÇÃO PARA NÃO CRIAR VÁRIAS VARIÁVEIS SEM NECESSIDADE
            fferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        new FileInputStream("arquivo.txt")));

            String linha = br.readLine(); // primeira linha
		 */
		
			
		/*exemplo usando SCANNER
		 * InputStream is = System.in;
        Scanner entrada = new Scanner(is);

        System.out.println("Digite sua mensagem:");
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        entrada.close();*/
		
		
		/* ERRADO
		 * OutputStream os = new FileOutputStream("saida.txt");
	        OutputStreamWriter osw = new OutputStreamWriter(os);
	        BufferedWriter bw = new BufferedWriter(osw);
	        
	        while (bw.hasNextLine()) {
	            String linha = bw.nextLine();
	            bw.write(linha);
	            bw.newLine(); 
	        }
	        bw.close();
		 */
			
	       //CORRETO para criar uma cópia do arquivo em vez de jogar na tela tem que usar em uma classe nova
	        Scanner entrada = new Scanner(System.in); //new Scanner(new FileInputStream("ler.txt"));
            PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
            
            while (entrada.hasNextLine()) {
                saida.println(entrada.nextLine());
            }
            saida.close();
            entrada.close();
		
        
	}

}
