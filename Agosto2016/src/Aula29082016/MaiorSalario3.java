package Aula29082016;

import java.util.Scanner;

public class MaiorSalario3 {

	static String  nomeMaiorSalario;
	static double  salarioMaior=0, somaSalarios=0;

	public static void main(String[] args) {
		for (int i=0; i<5; i++){
			verificaMaiorSalario(digitaSalario(),digitaNome());
		}//---------------------
		mostraDados();
	}//----------------final main

	static void acumulaSalario(double salario) {
		somaSalarios = somaSalarios + salario;
	}//-----------------------------------------

	static void mostraDados() {
		System.out.print("\n================================");
		System.out.print("\n   O maior salário é do(a) "+nomeMaiorSalario);
		System.out.print("\n   valor: "+salarioMaior);
		System.out.print("\n   Média salarial de "+somaSalarios/5);
		System.out.print("\n================================");
	}//-----------------------------------------

	
	static void verificaMaiorSalario(double salario, String nome) {
		if (salario > salarioMaior){
			nomeMaiorSalario = nome;
			salarioMaior     = salario;
		}//-------------------------
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
	/*
	static double salarioOk(String nome){
		double salario;
		do{
			salario = digitaSalario(nome);
		}while (salario < 0);
		acumulaSalario(salario);
		return salario;
	}//----------------------
*/
}//--------------------final classe

