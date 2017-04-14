package Aula31102016;

import java.util.Scanner;

public class Prefeitura {

	static final int tamanho = 20;

	static Dados vDados[] = new Dados[tamanho];

	static int indDados = 0;

	public static void main(String[] args) {
		
		boolean teste = true;
		
		criaDados();
		
		
		do {
			
			switch (menu()) {
			case '1':
				cadastro();
				break;

			case '2':
				relatorio();
				break;

			case '3':
				System.out.println("Fim do programa!");
				teste = false;
				break;

			}

		} while (teste);

	}

	private static void relatorio() {

		mostraDados();
		calculaMedia();
		porcentualSexo();
		porcentualDeSalario();
		

	}

	private static void porcentualSexo() {
		double salarioMulherBaixo = 0, salarioMulherMedio = 0, salarioMulherAlto = 0;
		double salarioHomemBaixo = 0, salarioHomemMedio = 0, salarioHomemAlto = 0;
		int totalMulheres = 0, totalHomens = 0;
		
		for (int i = 0; i < indDados; i++){
			if(vDados[i].getSexo() == 'F' || vDados[i].getSexo() == 'f' ){
				totalMulheres++;
				if (vDados[i].getSalario() <= 499.99) {
					salarioMulherBaixo++;
				}

				if (vDados[i].getSalario() > 499.99
						&& vDados[i].getSalario() <= 1399.99) {
					salarioMulherMedio++;
				}

				if (vDados[i].getSalario() > 1399.99) {
					salarioMulherAlto++;
				}
				
			}
			
			if(vDados[i].getSexo() == 'M' || vDados[i].getSexo() == 'm' ){
				totalHomens++;
				if (vDados[i].getSalario() <= 499.99) {
					salarioHomemBaixo++;
				}

				if (vDados[i].getSalario() > 499.99
						&& vDados[i].getSalario() <= 1399.99) {
					salarioHomemMedio++;
				}

				if (vDados[i].getSalario() > 1399.99) {
					salarioHomemAlto++;
				}
				
			}
			
		}
		if(totalMulheres > 0){
			salarioMulherBaixo = (salarioMulherBaixo * 100) / totalMulheres;
			salarioMulherMedio = (salarioMulherMedio * 100) / totalMulheres;
			salarioMulherAlto = (salarioMulherAlto * 100) / totalMulheres;
		}
		if(totalHomens > 0){
			salarioHomemBaixo = (salarioHomemBaixo * 100) / totalHomens;
			salarioHomemMedio = (salarioHomemMedio * 100) / totalHomens;
			salarioHomemAlto = (salarioHomemAlto * 100) / totalHomens;
		}
		
		
		
		System.out.println("\nO percentual de cada base de salário entre mulheres é: "
				+ "\n De 0 a 499,99: " + salarioMulherBaixo + "%"
				+ "\n De 499,99 a 1399,99: " + salarioMulherMedio + "%"
				+ "\n De 1400 para cima: " + salarioMulherAlto + "%");
		
		System.out.println("\nO percentual de cada base de salário entre homens é: "
				+ "\n De 0 a 499,99: " + salarioHomemBaixo + "%"
				+ "\n De 499,99 a 1399,99: " + salarioHomemMedio + "%"
				+ "\n De 1400 para cima: " + salarioHomemAlto + "%");
		
	}

	private static void porcentualDeSalario() {
		double salarioBaixo = 0, salarioMedio = 0, salarioAlto = 0;
		
		for (int i = 0; i < indDados; i++) {
			if (vDados[i].getSalario() <= 499.99) {
				salarioBaixo++;
			}

			if (vDados[i].getSalario() > 499.99
					&& vDados[i].getSalario() <= 1399.99) {
				salarioMedio++;
			}

			if (vDados[i].getSalario() > 1399.99) {
				salarioAlto++;
			}
		}
		salarioBaixo = (salarioBaixo * 100) / indDados;
		salarioMedio = (salarioMedio * 100) / indDados;
		salarioAlto = (salarioAlto * 100) / indDados;
		System.out.println("\nO percentual de cada base de salário total é: "
				+ "\n De 0 a 499,99: " + salarioBaixo + "%"
				+ "\n De 499,99 a 1399,99: " + salarioMedio + "%"
				+ "\n De 1400 para cima: " + salarioAlto + "%");

	}

	private static void mostraDados() {
		for (int i = 0; i < indDados; i++) {
			if (vDados[i] != null) {
				System.out.println(vDados[i]);
			}
		}

	}

	private static void calculaMedia() {
		double media = 0;
		double mediaIdade = 0;
		for (int i = 0; i < indDados; i++) {
			media += vDados[i].getSalario();
			mediaIdade += vDados[i].getIdade();

		}
		media = media / indDados;
		mediaIdade = mediaIdade / indDados;

		System.out.println("\nMédia de salário da população: " + media);
		System.out.println("\nMédia de idade da população: " + mediaIdade);

	}

	private static void cadastro() {
		if (indDados < tamanho) {
			vDados[indDados] = new Dados();
			vDados[indDados].setNome(digita("Qual o nome da Pessoa?"));
			vDados[indDados].setIdade(Integer.parseInt(digita("Qual a idade da pessoa?")));
			vDados[indDados].setSexo(digita("Sexo: \n Coloque [M]asculino ou [F]eminino.").charAt(0));
			vDados[indDados].setSalario(Double.parseDouble(digita("Qual o salário?")));
			indDados++;

		}else{
			System.out.println("Você excedeu o número de Cadastros.");
			System.out.println("Aperte Enter para volta ao Inicio.");
			digita("");
		}

	}

	private static void criaDados() {
		for (int i = 0; i < indDados; i++) {
			vDados[i] = new Dados();
		}

	}

	private static char menu() {
		String st = "";
		st += "\n-----------------";
		st += "\nMenu";
		st += "\n-----------------";
		st += "\n1- Digitar Dados";
		st += "\n2- Relatório";
		st += "\n3- Sair";
		st += "\nEscolha: ";
		return digita(st).charAt(0);

	}

	private static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();

	}

}
