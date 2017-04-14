package Aula30092016;

import java.util.Scanner;

public class PrincipalIvonei {
	static CidadeIvonei vCidades[] = new CidadeIvonei[4];
	static PessoaIvonei vPessoa[] = new PessoaIvonei[3];
	
	public static void main(String[] args) {
		for (int i = 0; i < vCidades.length; i++){
			vCidades[i] = new CidadeIvonei();
			vCidades[i].setNome(digita("Digite o nome da cidade: "));
		}
		
		for (int i = 0; i < vCidades.length; i++){
			System.out.println(vCidades[i]);//para isso ser possível tem que ter o ToString no objeto
		}
	
		//------------------------------------------------
		
		for (int i = 0; i < vPessoa.length; i++){
			vPessoa[i] = new PessoaIvonei();
			vPessoa[i].setNome(digita("Digite o nome da pessoa: ")); 
			
			for (int k = 0; k < vCidades.length; k++){
				System.out.println(k+" - "+vCidades[k]);
			}
			
			int op = Integer.parseInt(digita("Escolha uma cidade. "));
			vPessoa[i].setCidade(vCidades[op]);
		}
		
		for(int i = 0; i < vPessoa.length; i++){
			System.out.println(vPessoa[i]);
		}
		
	}//-------------------final main------------------------------------
	static String digita(String mens){
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}
	
	
}//-----------------------final classe----------------------------------