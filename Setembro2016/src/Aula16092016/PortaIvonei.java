package Aula16092016;
import java.util.Scanner;

public class PortaIvonei {
	private double altura;
	private double largura;
	private boolean posicao; // true=aberta false=fechada
	private String cor;

	public PortaIvonei(){
		altura = 2.10;
		largura= 0.80;
	}
	public double getAltura() {
		return altura;
	}// -----------------------------

	public void setAltura(double altura) {
		this.altura = altura;
	}// -----------------------------

	public double getLargura() {
		return largura;
	}// -----------------------------

	public void setLargura(double largura) {
		this.largura = largura;
	}// -----------------------------

	public boolean getPosicao() {
		return posicao;
	}// -----------------------------

	public void setPosicao(boolean posicao) {
		this.posicao = posicao;
	}// -----------------------------

	public String getCor() {
		return cor;
	}// -----------------------------

	public void setCor(String cor) {
		this.cor = cor;
	}// -----------------------------

	public void abrePorta() {
		if (!posicao)
			posicao = true;
		else
			System.out.println("Porta já está aberta.");
	}// -----------------------------

	public void fechaPorta() {
		if (posicao)
			posicao = false;
		else
			System.out.println("Porta já está fechada.");
	}// -----------------------------

	public String status() {
		if (posicao)
			return "Aberta";
		return "Fechada";
	}

	/////////////////////////////////////////////////////
	public static void main(String[] args) {
		PortaIvonei p = null;
		while (true) {
			switch (menu()) {
			case '0':
				System.exit(0);
				break;
			case '1':
				p = new PortaIvonei(); //criaObjeto();
				break;
			case '2':
				if (portaOk(p))
					p.abrePorta();
				break;
			case '3':
				if (portaOk(p))
					p.fechaPorta();
				break;
			case '4':
				if (portaOk(p))
					p.setCor(digita("Digite a cor: "));
				break;
			default:
				System.out.println("Escolha Incorreta. ");
			}
			mostraStatusPorta(p);

		} // -----------------while
	}// ---------------------final main

	private static void mostraStatusPorta(PortaIvonei p) {
		if (p != null) {
			System.out.println("\nStatus:");
			System.out.println("   Altura : " + p.getAltura());
			System.out.println("   Largura: " + p.getLargura());
			System.out.println("   Status : " + p.status());
			System.out.println("   Cor    : " + p.getCor());
		}
	}//----------------------------

	private static boolean portaOk(PortaIvonei p) {
		if (p == null) {
			System.out.println("Erro. Porta não existe ainda.");
			return false;
		}
		return true;
	}// ............................

	private static PortaIvonei criaObjeto() {
		return new PortaIvonei();
	}// ............................

	private static char menu() {
		String menu = "";
		menu += "\n===========================";
		menu += "\nMENU";
		menu += "\n===========================";
		menu += "\n0- Finaliza Código";
		menu += "\n1- criar objeto porta";
		menu += "\n2- abre a porta";
		menu += "\n3- fecha a porta";
		menu += "\n4- pintar a porta";
		menu += "\n===========================";
		menu += "\nEscolha: ";
		return digita(menu).charAt(0);
	}// ............................

	private static String digita(String menu) {
		Scanner e = new Scanner(System.in);
		System.out.print(menu);
		return e.nextLine();
	}// ............................
}// =========================final classe
