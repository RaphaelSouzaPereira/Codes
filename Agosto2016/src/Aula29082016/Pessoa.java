package Aula29082016;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private double salario;
	
	public Pessoa(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public Pessoa(){
		
	}

	public void setNome(String nome){
		this.nome = nome;
	}//-------------------------
	
	public void setSalario(double salario){
		this.salario = salario;
	}//-------------------------
	
	public double getSalario(){
		return salario;
	}//-------------------------
	public String getNome(){
		return nome;
	}//-------------------------

	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Pessoa pessoaMaiorSalario = new Pessoa();
		Pessoa pessoa;
		double somaSalario = 0;
		for (int i=0; i<5; i++){
			pessoa = new Pessoa();
			pessoa.setNome   (digitaNome()   );
			pessoa.setSalario(digitaSalario());
			
			pessoaMaiorSalario = verificaMaiorSalario(pessoa, pessoaMaiorSalario);
			somaSalario += pessoa.getSalario();
		}//---------------------
		mostraDados(pessoaMaiorSalario, somaSalario);
	}//----------------final main


	static void mostraDados(Pessoa pMaiorSal, double soma) {
		System.out.print("\n================================");
		System.out.print("\n   O maior salário é do(a) "+pMaiorSal.getNome());
		System.out.print("\n   valor: "+pMaiorSal.getSalario());
		System.out.print("\n   Média salarial de "+soma/5);
		System.out.print("\n================================");
	}//-----------------------------------------

	
	static Pessoa verificaMaiorSalario(Pessoa p, Pessoa pMaiorSal) {
		if (p.getSalario() > pMaiorSal.getSalario()){
			return p;
		}//-------------------------
		return pMaiorSal;
	}//-----------------------------------------

	static double digitaSalario() {
		Scanner e = new Scanner(System.in);
		System.out.print("Digite o salário: ");
		return e.nextDouble();
	}//--------------------------

	static String digitaNome() {
		Scanner e = new Scanner(System.in);
		System.out.print("\nDigite o nome da Pessoa: ");
		return e.nextLine();
	}//-----------------------
	
}//--------------------final classe
