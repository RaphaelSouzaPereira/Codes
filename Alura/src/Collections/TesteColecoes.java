package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import Objeto.Data;

public class TesteColecoes {

	public static void main(String[] args) {

		LinkedList<String> nomes = new LinkedList<String>();
		
		/*Map<String, Data> nomes = new HashMap<String, Data>();
		este serve para colocar com conjuto como id para achar cada uma das contas 
		
		ai mudaria o método para adionar seria assim
		ContaReals.put("diretor", d1);
		ContaReals.add("gerente", d2);
		
		System.out.println(datas.get("diretor").gerSaldo());
		para poder buscar a informar ele irá buscar todos a id diretor ele informara o que tem dentro do objeto como o saldo
		então esse meio funciona usando id/coloca objeto.
		
		*/
		
		
		
		//ArrayList<String> nomes = new ArrayList<String>();

		// Set<String> nomes = new HashSet<String>();
		// ai ele compara quantas
		// vezes foi usado o mesmo
		// parametro em todo o array
		// e devolve um numero

		nomes.add("Mauricio");
		nomes.add("Guilherme");

		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));

		Collections.sort(nomes);

		System.out.println("Ordenado!");

		// novo meio de varrer um array usando o ArrayList;
		for (String nome : nomes) {
			System.out.println(nome);
		}

		LinkedList<ContaReal> ContaReals = new LinkedList<ContaReal>();

		ContaReal d1 = new ContaReal(1500.0, 1, null);
		ContaReal d2 = new ContaReal(700.0, 2, null);

		ContaReals.add(d1);
		ContaReals.add(d2);

		Collections.sort(ContaReals);//organizar de acordo com o parametro escolhido tipo string ordem alfabetica, int ordem crescente

		System.out.println(ContaReals.get(1));

		for (ContaReal d : ContaReals) {
			System.out.println(d.getSaldo());
		}
		
		LinkedList<ContaReal> contas1 = new LinkedList<ContaReal>();
		
		ContaReal d3 = new ContaReal(1500.0, 3, null);
		ContaReal d4 = new ContaReal(5000.0, 4, null);
		
		ContaReals.add(d3);
		ContaReals.add(d4);
		
		Collections.sort(ContaReals);
		
		/*Código do professor;
		 * 
		 * List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();

	        ContaPoupanca c1 = new ContaPoupanca(400, "Caio");
	        c1.deposita(1500.0);
	        contas.add(c1);

	        ContaPoupanca c2 = new ContaPoupanca(467, "Adriano");
	        c2.deposita(2050.99);
	        contas.add(c2);

	        ContaPoupanca c3 = new ContaPoupanca(230, "Victor");
	        c3.deposita(1070.0);
	        contas.add(c3);

	        Collections.sort(contas);

	        for (ContaPoupanca conta : contas) {
	            System.out.println(conta);
	        }
	    */
		

	}

}
