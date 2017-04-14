package Aula07112016;
import java.util.Scanner;

public class Pesquisa02Ivonei {
	static final int tamanho  = 20;
	static Pessoa02Ivonei vPesquisa[] = new Pessoa02Ivonei[tamanho];
	static int indPesquisa    = 0;
	
	public static void main(String [] args){
		while(true){
			switch(menu()){
			case '1': digitaDados();
			break;
			case '2': relatorio();
			break;
			default:
				System.out.println("ERRO. opção errada. ");
				digita("Enter para retornar ao menu.");
			}
		}
	}//--------------------------------------main

	private static void relatorio() {
		if (vPesquisa[0] == null)
			System.out.println("Erro. Nenhum cadastro realizado.");
		else{
			System.out.println("\n=======================================");
			System.out.println("Média de Salario da População= "+mediaSalarial());
			System.out.println("Média etária da População    = "+mediaEtaria());
			percentuais();
		}
	}

	private static void percentuais() {
		System.out.println("\n====Percentuais====");
		System.out.println("Homens:");
		System.out.println("   de   0 a   500: "+calculaFaixa('M',0,500));
		System.out.println("   de 500 a 1.400: "+calculaFaixa('M',500,1400));
		System.out.println("   acima de 1.400: "+calculaFaixa('M',1400,0));

		System.out.println("Mulheres:");
		System.out.println("   de   0 a   500: "+calculaFaixa('F',0,500));
		System.out.println("   de 500 a 1.400: "+calculaFaixa('F',500,1400));
		System.out.println("   acima de 1.400: "+calculaFaixa('F',1400,0));
	}

	private static double calculaFaixa(char sexo, double menor, double maior) {
		int contador = 0;
		for (int i = 0; i < vPesquisa.length; i++) {
			if (vPesquisa[i]!=null){
				if (vPesquisa[i].getSexo() == sexo)
					if (vPesquisa[i].getSalario() >= menor && (vPesquisa[i].getSalario() < maior || maior == 0))
						contador++;
			}
		}
		return contador*100.0/indPesquisa;
	}

	private static String mediaEtaria() {
		double soma = 0;
		int    ind  = 0;
		
		for (int i = 0; i < vPesquisa.length; i++) {
			if (vPesquisa[i]!=null){
				soma += vPesquisa[i].getIdade();
				ind++;
			}
		}
		return ""+(soma/ind);
	}//---------------------------------------------------

	private static String mediaSalarial() {
		double soma = 0;
		int    ind  = 0;
		
		for (int i = 0; i < vPesquisa.length; i++) {
			if (vPesquisa[i]!=null){
				soma += vPesquisa[i].getSalario();
				ind++;
			}
		}
		return ""+(soma/ind);
	}//---------------------------------------------------

	private static void digitaDados() {
		Pessoa02Ivonei p = new Pessoa02Ivonei(digita("\n[fim] - retorna ao menu."+"\n...Digite o nome da Pessoa: "));
		
		while(!p.finaliza()){
			if (indPesquisa < tamanho){
				while (!p.idadeOk())   
					p.setIdade(digita("...Digite a idade da Pessoa: "));
				while (!p.salarioOk()) 
					p.setSalario(digita("...Digite o salário da Pessoa: "));
				while (!p.sexoOk())    
					p.setSexo(digita("...Digite o sexo F/M: "));
				vPesquisa[indPesquisa++] = p;
				p = new Pessoa02Ivonei(digita("\n[fim] - retorna ao menu."+"\n...Digite o nome da Pessoa: "));
			}
		}
	}//---------------------------------------------------

	private static char menu() {
		String menu = "\n==============================";
		menu += "\nMENU";
		menu += "\n==============================";
		menu += "\n1- Digita Dados da Pesquisa.";
		menu += "\n2- Resultados da Pesquisa.";
		menu += "\n   Escolha: ";
		
		return digita(menu).charAt(0);
	}//------------------------------------------

	private static String digita(String menu) {
		Scanner e = new Scanner(System.in);
		System.out.print(menu);
		return e.nextLine();
	}
}//==========================================classe
