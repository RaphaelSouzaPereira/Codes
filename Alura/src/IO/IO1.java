package IO;

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

public class IO1 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("leitura.txt"); //new FileInputStream("leitura.txt"); abrir o arquivou ou  System.in; escrever no console; 
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("saida.txt");// ler no arquivo ou  System.out; printar direto;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		while(linha != null){		
		bw.append(linha);
		bw.newLine();
		linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
		//OU!!!!!
		
		Scanner sc = new Scanner(new FileInputStream("leitura.txt"));
		PrintStream ps = new PrintStream("saida.txt");
		while(sc.hasNextLine()){
			String linha1 = sc.nextLine();
			ps.println(linha1);
		}
		ps.close();
		sc.close();
		
	}
}
