package Aula30092016;
import java.util.Scanner;

public class PrincipalIvonei2 {
	static CidadeIvonei2 vCidades[] = new CidadeIvonei2[4];
	static PessoaIvonei2 vPessoas[] = new PessoaIvonei2[3];
	static boolean vCidadesOk = false;

	public static void main(String[] args) {

		while (true) {
			switch (menu()) {
			case '1':
				cadastrarCidades();
				break;
			case '2':
				listarCidades();
				break;
			case '3':
				cadastrarPessoas();
				break;
			case '4':
				listarPessoas();
				break;
			}
		}

	}// --------------------------final main

	private static char menu() {
		String st = "";
		st += "\n-----------------";
		st += "\nMenu";
		st += "\n-----------------";
		st += "\n1- Cadastrar Cidades";
		st += "\n2- Listar Cidades";
		st += "\n3- Cadastrar Pessoas";
		st += "\n4- Listar Pessoas";
		st += "\nEscolha: ";
		return digita(st).charAt(0);
	}// --------------------------------------

	private static void listarPessoas() {
		for (int i = 0; i < vPessoas.length; i++) {
			System.out.println(vPessoas[i]);
		}
	}// ----------------------------------------

	private static void cadastrarPessoas() {
		if (vCidades[0] == null){
			System.out.println("....Erro. Nenhuma Cidade Cadastrada.");
			System.out.println("    Enter volta ao menu.");
			digita("");
		}
		else
			for (int i = 0; i < vPessoas.length; i++) {
				vPessoas[i] = new PessoaIvonei2();
				vPessoas[i].setNome(digita("Digite o nome da Pessoa: "));
				System.out.println("Cidades Cadastradas:");
				for (int j = 0; j < vCidades.length; j++) {
					System.out.println(j + "- " + vCidades[j]);
				}
				int indCidade = Integer.parseInt(digita("Escolha uma cidade: "));
				vPessoas[i].setCidade(vCidades[indCidade]);
			}
	}// -----------------------------------------------

	private static void listarCidades() {
		for (int i = 0; i < vCidades.length; i++) {
			System.out.println(vCidades[i]);
		}
	}// -------------------------------------------

	private static void cadastrarCidades() {
		for (int i = 0; i < vCidades.length; i++) {
			vCidades[i] = new CidadeIvonei2();
			vCidades[i].setNome(digita("Digite o nome da Cidade: "));
		}
		vCidadesOk = true;
	}// --------------------------------------------

	static String digita(String men) {
		Scanner e = new Scanner(System.in);
		System.out.print(men);
		return e.nextLine();
	}
}// -----------------------------classe
