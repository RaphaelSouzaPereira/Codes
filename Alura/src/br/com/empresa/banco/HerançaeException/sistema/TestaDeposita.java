package br.com.empresa.banco.Heran�aeException.sistema;

import br.com.empresa.banco.Heran�aeException.ValorInvalidoException;
import br.com.empresa.banco.Heran�aeException.conta.Conta;
import br.com.empresa.banco.Heran�aeException.conta.ContaCorrente;

public class TestaDeposita {

	public static void main(String[] args) {
		 Conta cp = new ContaCorrente();
		 try{
	        cp.deposita(-100);
		 }catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		 }
		 //finally roda mesmo o try ou catch n�o dando erro
		 try {
			  throw new RuntimeException("excecao forcada");
			} catch(Exception e) {
			  System.out.println("deu erro");
			} finally {
			  System.out.println("acabou");
			}
	        
	    }
	}


