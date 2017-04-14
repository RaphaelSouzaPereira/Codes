package Aula29082016;

import java.util.Scanner;

		public class Exercicio062Incompleto{
		
			public static void main(String[] args) {
				Exercicio061PessoaseSalario p1 = new Exercicio061PessoaseSalario();
				Exercicio061PessoaseSalario p2 = new Exercicio061PessoaseSalario();
				
				
				for (int i = 0 ; i<5 ; i++){
					System.out.println(digitaNome());
					System.out.println(digitaSalario());
					p1.setNome(digitaNome());
					p1.setSalario(digitaSalario());
					if (p1.getSalario()>p2.getSalario()){
						p2.setSalario(p1.getSalario());
						p2.setNome(p1.getNome());
					}
						System.out.println(p2.getNome()+"  "+p2.getSalario());
						System.out.println(p1.getNome()+"  "+p1.getSalario());
				}
				
				
				
			}// main

			private static float digitaSalario() {
				Scanner e = new Scanner(System.in);
				System.out.println("Digite o salário: ");
				return e.nextFloat();
			}

			private static String digitaNome() {
				Scanner e = new Scanner(System.in);
				System.out.println("Digite o nome: ");
				return e.nextLine();
			}

		


		}

