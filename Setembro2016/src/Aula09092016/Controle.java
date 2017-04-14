package Aula09092016;

import java.util.Scanner;

public class Controle {
	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		Cachorro p1 = new Cachorro();
	do{
		
	p1.setNome(digitaNome());
	p1.setdtNascimento(digitaIdade());
	p1.setRaca(digitaRaca());
	p1.setPorte(digitaPorte());
		
	System.out.println("O nome do cachorro é: "+p1.getNome());
	System.out.println("A raca do cachorro é: "+p1.getRaca());
	System.out.println("A data de nascimento é "+p1.getdtNascimento());
	System.out.println("O porte do cachorro é "+p1.getPorte());
	}//-------------------DO------------------------------------------
	while (continuar());
}//-----------------------MAIN----------------------------------------
	private static boolean continuar() {
	System.out.println("Você deseja continuar? [s]im ou [n]ão ");
	char resp = e.next().charAt(0);
	if (resp == 's')
		return true;
	return false;
	}//------------------CONTINUAR-----------------------------------
	private static String digitaPorte() {
	System.out.println("Digite o porte do Cachorro [P]equeno, [M]edio e [G]rande");
	char porte = e.next().charAt(0); 
	String Porte;
		if (porte == 'P'){
			Porte = "Pequeno";
			return Porte;
				}
		if (porte == 'M'){
			Porte = "Médio";
			return Porte;
				}
		if (porte == 'G');{
			Porte = "Grande";
			return Porte;
				}
	}//------------------DIGITAPORTE----------------------------------
	private static String digitaRaca() {
	System.out.println("Digite a raça do Cachorro: ");
	String mens = e.nextLine();
	return mens;
}//----------------------DIGITARACA-----------------------------------	
	private static String digitaIdade() {
	System.out.println("Digite a data de nascimento do Cachorro: ");
	String mens = e.nextLine();
	return mens;
}//----------------------DIGITAIDADE----------------------------------
	private static String digitaNome() {
	System.out.println("Digite o nome do cachorro");
	String mens = e.nextLine();
	return mens;
}//-----------------------DIGITANOME----------------------------------
}//-----------------------CLASSE CONTROLE-----------------------------

/*Exercicio01
Abra um projeto com o nome de ExempoAula07.
Crie uma classe Cachorro com os seguintes atributos:
nome (string)
raca (string)
dtNascimento(string)
porte(char) >> [P]equeno, [M]edio e [G]rande

Para a classe Cachorro crie os gets e sets para cada atributo.

Crie uma classe chamada Controle. Nesta classe você deverá instanciar um 
objeto cao, preencher seus atributos e imprimí-los.
Faça isto para apenas um objeto cao.*/