package Aula30092016;

import java.util.Scanner;

public class PrincipalRaphael {
	static CidadeRaphael vCidades[] = new CidadeRaphael[4];
	static PessoaRaphael vPessoa[] = new PessoaRaphael[4];
	static boolean vCidadeok = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			switch (menu()) {
			case '0':
				System.out.println("Fim do programa.");
				System.exit(0);
				break;
			case '1':
				cadastraCidade();
				break;
			case '2':
				listaCidades();
				break;
			case '3':
				cadastraPessoa(vPessoa);
				break;
			case '4':
				listaPessoa();
				break;
			default:
				System.out.println("Escolha Incorreta. ");
			}
	}
}//----------------------------MAIN--------------------
	private static void listaPessoa() {
		for(int i = 0; i < vPessoa.length; i++){
			System.out.println(vPessoa[i]);
		}
	}
	private static void cadastraPessoa(PessoaRaphael vPessoa[]) {
		if(vCidadeok == false){//ou if(vCidade[0] == null);
			System.out.println("...Erro nenhuma cidade cadastrada.");
			System.out.println("...Aperte enter para voltar ao menu.");
			digita("");
		}
		else
			for (int i = 0; i < vPessoa.length; i++){
			vPessoa[i] = new PessoaRaphael();
			vPessoa[i].setNome(digita("Digite o nome da pessoa: "));

			for (int k = 0; k < vCidades.length; k++){
				System.out.println(k+" - "+vCidades[k]);
			}
			int op = Integer.parseInt(digita("Escolha uma cidade. "));
			vPessoa[i].setCidade(vCidades[op]);
		}
		
	}
	private static void listaCidades() {
		for (int i = 0; i < vCidades.length; i++){
			System.out.println(i+" - "+vCidades[i]);//para isso ser possível tem que ter o ToString no objeto
		}
	}
	private static void cadastraCidade() {
		for (int i = 0; i < vCidades.length; i++){
			vCidades[i] = new CidadeRaphael();
			vCidades[i].setNome(digita("Digite o nome da cidade: "));
		}
		vCidadeok = true;
	}
	static String digita(String mens){
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}
		
	private static char menu() {
		String menu = "";
		menu += "\n===========================";
		menu += "\nMENU";
		menu += "\n===========================";
		menu += "\n0- Finaliza Código";
		menu += "\n1- Cadastra Cidade";
		menu += "\n2- Lista Cidade";
		menu += "\n3- Cadastra Pessoa";
		menu += "\n4- Lista Pessoa";
		menu += "\n===========================";
		menu += "\nEscolha: ";
		return digita(menu).charAt(0);
	}// ............................
}
