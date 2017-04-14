package Aula28102016;
import java.util.Scanner;

public class ControleIvonei {
	static final int tamanho = 11;
	
	static PartidoIvonei  vPartido[]  = new PartidoIvonei[tamanho];
	static DeputadoIvonei vDeputado[] = new DeputadoIvonei[tamanho];
	
	static int indP = 0;
	static int indD = 0;
	
	public static void main(String[] args) {
		while (true){
			switch(digita(menu()).charAt(0)){
			case '1': cadastraPartido();
			break;
			case '2': listaPartido();
			break;
			case '3': cadastraDeputado();
			break;
			case '4': listaDeputado();
			break;
			case '5': listaCorrupto();
			break;
			}
		}
	}

	private static void listaCorrupto() {
		for (int i = 0; i < vDeputado.length; i++) {
			if (vDeputado[i].getIndacorCorrupcao() == 5)
				System.out.println(vDeputado[i]);
		}
		
	}

	private static void listaDeputado() {
		for (int i = 0; i < vDeputado.length; i++) {
			if(vDeputado[i]!= null)
				System.out.println(vDeputado[i]);
		}
		
	}

	private static void cadastraDeputado() {
		if (indD < tamanho){
			vDeputado[indD] = new DeputadoIvonei();
			vDeputado[indD].setNome(digita("Digite o nome do Deputado: "));
			vDeputado[indD].setIndacorCorrupcao(Integer.parseInt(digita("Digite o indice de corrupção: ")));
			for (int j = 0; j < indP; j++) {
				System.out.println("["+j+"]-"+vPartido[j].getSigla());
			}
			int resp = Integer.parseInt(digita("Escolha o indice do partido: "));
			vDeputado[indD].setPartido(vPartido[resp]);
			indD++;
		}
	}

	private static PartidoIvonei partidoescolhido() {
		for (int i = 0; i < vPartido.length; i++) {
			System.out.println("["+i+"]- "+vPartido[i]);
		}		
		return vPartido[Integer.parseInt(digita("...Escolhe um partido(indice): "))];
	}

	private static void listaPartido() {
		for (int i = 0; i < vPartido.length; i++) {
			if(vPartido[i]!=null)
				System.out.println(vPartido[i]);
		}
	}

	private static void cadastraPartido() {
		if(indP<tamanho)
			vPartido[indP++] = partido();
	}

	private static PartidoIvonei partido() {
		PartidoIvonei p = new PartidoIvonei();
		p.setSigla(digita("  Digite a sigla do partido: "));
		p.setNumero(Integer.parseInt(digita("  Digite o número do partido: ")));
		return p;
	}

	private static String digita(String menu) {
		Scanner e = new Scanner(System.in);
		System.out.println(menu);
		return e.nextLine();
	}

	private static String menu(){
		String menu = "";
		menu += "\nMENU";
		menu += "\n=======";
		menu += "\n1-Cadastrar Partidos.";
		menu += "\n2-Listagem de Partidos.";
		menu += "\n3-Cadastrar Deputados.";
		menu += "\n4-Listagem de Deputados.";
		menu += "\n5-Listagem dos Corruptos.";
		menu += "\n  Escolha: "; 
		return menu;
	}
}
