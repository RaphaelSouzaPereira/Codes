package Aula18112016;

import java.util.Scanner;

public class ControleMouse {
	
	static final int tamanho = 200;	
	static Mouse vMouse[] = new Mouse[tamanho];
	static Defeito vDefeito[] = new Defeito[3];
	static int indMouse = 0, indDefeito = 0;
	static double	QtDefeito1 = 0, QtDefeito2 = 0, QtDefeito3 = 0;
	static boolean teste = true;
	
	public static void main(String[] args) {
		
		criaMouse();
		criaDefeito();
		

		do {
			switch (menu()) {
			case '1':
				cadastraDefeito();
				break;
			case '2':
				listaDefeito();
				break;
			case '3':
				cadastraMouse();
				break;
			case '4':
				listaMouse();
				break;
			case '0':
				System.out.println("Fim do programa!");
				teste = false;
				break;
			}
		} while (teste);
	

	}


	private static void listaMouse() {
		System.out.println("Total de Mouse cadastrado: "+indMouse);
		if(vDefeito[0].getDefeito() != null){
				System.out.println("Situação: "+vDefeito[0].getDefeito()+" Quantidade: "+QtDefeito1+" e isso da o total de "+media(QtDefeito1,indMouse)+"%");
				if(vDefeito[1].getDefeito() != null){
					System.out.println("Situação: "+vDefeito[1].getDefeito()+" Quantidade: "+QtDefeito2+" e isso da o total de "+media(QtDefeito2,indMouse)+"%");

					}
				if(vDefeito[2].getDefeito() != null){
					System.out.println("Situação: "+vDefeito[2].getDefeito()+" Quantidade: "+QtDefeito3+" e isso da o total de "+media(QtDefeito3,indMouse)+"%");

				}
			}else{
				System.out.println("Você não cadastrou defeitos nem mouses...");
				System.out.println("Aperte Enter para voltar ao Inicio.");
				digita("");
			}
		
			
	}

	private static Double media(double qtDefeito, int total) {
		Double media = (qtDefeito*100)/total;
		return media;
	}

	private static void cadastraMouse() {
		if(indMouse < tamanho){
			vMouse[indMouse] = new Mouse();
			boolean teste2 = true;
			while(teste2 == true){
			try{
			vMouse[indMouse].setIdentificacao(Integer.parseInt(digita("Digite o número de indentificação: ")));
			while(vMouse[indMouse].getIdentificacao() < 1000 || vMouse[indMouse].getIdentificacao() >= 10000 ){
				vMouse[indMouse].setIdentificacao(Integer.parseInt(digita("Digite o número de indentificação entre 1000 e 9999: ")));				
			}
			teste2 = false;
			}catch(Exception e){
				System.out.println("Digite apenas números!");
				teste2 = true;
				}
			}
			listaDefeito();
			boolean teste3 = true;
			int escolha = 0;
			while(teste3 == true){
				try{
					escolha = Integer.parseInt(digita("Escolha um dos defeitos: "));
					if(escolha <= 0 && escolha > 3){
						escolha = Integer.parseInt(digita("Digite um valor válido: "));
					}
				teste3 = false;
				}catch(Exception e){
					System.out.println("Digite apenas números!");
					teste3 = true;
					}
				}
			if(escolha == 1){
				vMouse[indMouse].setDefeito(vDefeito[0]);
				QtDefeito1++;
				}
			if(escolha == 2){
				vMouse[indMouse].setDefeito(vDefeito[1]);
				QtDefeito2++;
				}
			if(escolha == 3){
				vMouse[indMouse].setDefeito(vDefeito[2]);
				QtDefeito3++;
				}
			indMouse++;
		}else{
			System.out.println("Você ultrapassou o limite de mouses!");
			System.out.println("Aperte Enter para voltar ao Inicio.");
			digita("");
		}
	
	}

	private static void listaDefeito() {
		for(int i = 0; i < vDefeito.length; i++){
			if(vDefeito[i].getDefeito() != null){
				System.out.println((i+1)+" - "+vDefeito[i].getDefeito());
				}
			}
		if(vDefeito[0].getDefeito() == null){
			System.out.println("Você não cadastrou nenhum defeito ainda.");
			System.out.println("Aperte Enter para voltar ao Inicio.");
			digita("");
			
		}
		
	}

	private static void cadastraDefeito() {
		if (indDefeito < 3) {
			vDefeito[indDefeito] = new Defeito();
			vDefeito[indDefeito].setDefeito(digita("Descreva o possível defeito: "));
			indDefeito++;
		}else{
			System.out.println("Você só pode descrever no máximo 3 possíveis defeitos.");
			System.out.println("Aperte Enter para volta ao Inicio e cadastrar.");
			digita("");
			return;
		}
			
		
	}

	private static void criaDefeito() {
		for (int i = 0; i < 3; i++) {
			vDefeito[i] = new Defeito();
		}
		
	}

	private static void criaMouse() {
		for (int i = 0; i < tamanho; i++) {
			vMouse[i] = new Mouse();
			
		}
		
	}
	
	private static char menu() {
		String st = "";
		st += "\n-----------------";
		st += "\nMenu";
		st += "\n-----------------";
		st += "\n1- Cadastra Defeitos";
		st += "\n2- Listar Defeitos";
		st += "\n3- Cadastra Mouse";
		st += "\n4- Relatório de Mouses com Problemas";		
		st += "\n0- Sair";
		st += "\nEscolha: ";
		return digita(st).charAt(0);

	}
	
	private static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}
}
