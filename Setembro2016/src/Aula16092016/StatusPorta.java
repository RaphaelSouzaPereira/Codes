package Aula16092016;

import java.util.Scanner;

public class StatusPorta {

	public static void main(String[] args) {
		
		int opcao;
		
		Porta p1 = null;
		do {
		
			Scanner e = new Scanner(System.in);
			System.out.println("\n\nMENU");
			System.out.println("1- Criar objeto porta");
			System.out.println("2- Abrir porta");
			System.out.println("3- Fechar porta");
			System.out.println("4- Pintar porta:");
			System.out.println("5- Mostra como a porta está.");
			System.out.println("6- Finaliza");	
			opcao = e.nextInt();
			
			if (opcao == 1) {
				CriaPorta();
			}
			if (opcao == 2) {
				p1.setStatusPorta(true);
			}
			if (opcao == 3) {
				p1.setStatusPorta(false);
			}
			if (opcao == 4) {
				p1.setCor(PintaPorta());
			}
			if (opcao == 5) {
				mostraPorta(p1.getAltura(), p1.getLargura(), p1.getCor(), p1.getStatusPorta());
			}

		} while (opcao != 6 );
		System.out.println("FIM DO PROGRAMA!");

	}
	
	private static Porta CriaPorta() {
		Porta p1 = new Porta();
		System.out.println("Porta Criada.");
		return p1;
		
	}

	private static String PintaPorta() {
		String corPorta = "";
		int escolha = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Escolha a cor da porta: ");
		System.out.println("1 - BRANCA.");
		System.out.println("2 - PRETA. ");
		System.out.println("3 - VERMELHA");
		System.out.println("4 - Para Sair.");
		escolha = a.nextInt();
		if (escolha == 1) {
			corPorta = "BRANCA";
		}
		if (escolha == 2) {
			corPorta = "PRETA";
		}
		if (escolha == 3) {
			corPorta = "VERMELHA";
		}
		
	return corPorta;
	}

	private static void mostraPorta(double Altura, double largura, String cor, boolean status) {
	System.out.println("A altura da porta é: "+Altura);
	System.out.println("A largura da porta é: "+largura);
	System.out.println("A cor da porta é: "+cor);
	if (status == false){
	System.out.println("A porta está fechada.");
	}
	else if (status == true){
	System.out.println("A porta está aberta.");
	}
}
	
}// ------------------class--------------------
	

 
 
 
 
 

