package Aula07112016;
import java.util.Scanner;

public class Pesquisa01Ivonei {

	static final int tamanho = 2;
	static String vNome[] = new String[tamanho];
	static int vIdade[] = new int[tamanho];
	static double vSalario[] = new double[tamanho];
	static char vSexo[] = new char[tamanho];

	static int indice = 0;

	public static void main(String[] args) {
		while (true) {
			switch (menu()) {
			case '1':
				digitaDados();
				break;
			case '2':
				relatorio();
				break;
			default:
				System.out.println("ERRO. opção errada. ");
				digita("Enter para retornar ao menu.");
			}
		}
	}// --------------------------------------main

	private static void relatorio() {
		if (vNome[0] == null)
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
		int tot = 0;
		for (int i = 0; i < vNome.length; i++) {
			if (vNome[i]!=null){
				if (vSexo[i] == sexo){
					tot++;
					if (vSalario[i] >= menor && (vSalario[i] < maior || maior == 0))
						contador++;
				}
			}
		}
		return contador*100.0/tot;
	}

	private static String mediaEtaria() {
		double soma = 0;
		int    ind  = 0;
		
		for (int i = 0; i < vNome.length; i++) {
			if (vNome[i]!=null){
				soma += vIdade[i];
				ind++;
			}
		}
		return ""+(soma/ind);
	}//---------------------------------------------------

	private static String mediaSalarial() {
		double soma = 0;
		int    ind  = 0;
		
		for (int i = 0; i < vNome.length; i++) {
			if (vNome[i]!=null){
				soma += vSalario[i];
				ind++;
			}
		}
		return " "+(soma/ind);
	}//---------------------------------------------------
	
	
	private static void digitaDados() {
		for (int i = 0; i < tamanho; i++) {
			if (vNome[i] == null) {
				vNome[i] = digita("...Nome: ");
				vIdade[i] = verificaIdade();
				vSalario[i] = Double.parseDouble(digita("...Salario: "));
				vSexo[i] = digita("...Sexo: ").charAt(0);
				break;
			}
		}
	}

	private static int verificaIdade() {
		int idade = 0;
		while (idade <= 0) {
			try {
				idade = Integer.parseInt(digita("...Idade: "));
			} catch (Exception erro) {
				idade = 0;
			}
		}
		return idade;
	}

	private static char menu() {
		String menu = "\n==============================";
		menu += "\nMENU";
		menu += "\n==============================";
		menu += "\n1- Digita Dados da Pesquisa.";
		menu += "\n2- Resultados da Pesquisa.";
		menu += "\n   Escolha: ";

		return digita(menu).charAt(0);
	}// ------------------------------------------

	private static String digita(String menu) {
		Scanner e = new Scanner(System.in);
		System.out.print(menu);
		return e.nextLine();
	}
}// ==========================================classe