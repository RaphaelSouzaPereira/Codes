package Aula20032017;

import com.senac.SimpleJava.Console;

public class ContagemDasLetras {
	public void run(){
		String letras = Console.readLine("Digite um texto: ");
		int[] contador = new int[27];
		char conta;
		
		Console.println(letras.length());
		
		char[] string = letras.toLowerCase().toCharArray();
		for (char caracter : string){
			if(caracter == ' '){
				contador[0]++;
			}else{
				int pos = caracter - 'a' + 1;
				contador[pos]++;
			}
			
		}
			if(contador[0] > 0){
				Console.println("Espaco: ",contador[0]);
				
			}
			for(int i = 1; i < contador.length; i++){
			if(contador[i] > 0 )
				Console.println((char) i+'a'-1,": ",contador[i]);
			}
	}
}
