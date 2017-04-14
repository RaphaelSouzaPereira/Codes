package Aula23092016;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		
		Cidade c = new Cidade();
		Cidade c2 = new Cidade();
		Cidade c3 = new Cidade();
		
		c.setNome(digita("Digite o nome da Cidade: "));
		c.setPopulacao(digitaDados("Digite o valor da população: "));
		//c.setPopulacao(Integer.parseInt(digita("Digite o valor da população: ")));
		c2.setNome(digita("Digite o nome da Cidade: "));
		c2.setPopulacao(digitaDados("Digite o valor da população: "));
		//c2.setPopulacao(Integer.parseInt(digita("Digite o valor da população: ")));
		c3.setNome(digita("Digite o nome da Cidade: "));
		c3.setPopulacao(digitaDados("Digite o valor da população: "));
		//c3.setPopulacao(Integer.parseInt(digita("Digite o valor da população: ")));
		
		Pessoa p = new Pessoa();
		
		p.setNome(digita("Digite o nome de uma pessoa: "));
		
		System.out.println("...Escolha uma cidade: ");
		System.out.println("[1] "+c.getNome());
		System.out.println("[2] "+c2.getNome());
		System.out.println("[3] "+c3.getNome());
		
		int op = Integer.parseInt(digita("...Escolha: "));
		//ou
		//char op1 = digita("...Escolha: ").charAt(0);
		//ou
		//String op = digita("...Escolha: ");
		
		if (op == 1)
			p.setCidade(c);
		if (op == 2)
			p.setCidade(c2);
		if (op == 3);
			p.setCidade(c3);
		
			//ou
		
		/*if (op == '1')
			p.setCidade(c);
		if (op == '2')
			p.setCidade(c2);
		if (op == '3');
			p.setCidade(c3);*/
		
			//ou
		
		/*if (op.equals("1"))
			p.setCidade(c);
		if (op.equals("2"))
			p.setCidade(c2);
		if (op.equals("3"))
			p.setCidade(c3);*/
	
		System.out.println(".....Nome: "+ p.getNome());
		System.out.println(".....Cidade: "+ p.getCidade().getNome());
		System.out.println(".....População: "+p.getCidade().getPopulacao());
		System.out.println("\n"+p.getCidade());
		System.out.println("\n"+p);

	}//------------------final main----------------

	private static int digitaDados(String mens) {
		Scanner e1 = new Scanner(System.in);
		System.out.println(mens);
		return e1.nextInt(); 
		
	}

	public static String digita(String mens){
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}
}//-----------------------final classe----------------------------------
