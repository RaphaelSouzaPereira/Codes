package br.com.empresa.banco.HerançaeException.sistema;

import br.com.empresa.banco.HerançaeException.AtualizadorDeContas;
import br.com.empresa.banco.HerançaeException.conta.Conta;
import br.com.empresa.banco.HerançaeException.conta.ContaCorrente;
import br.com.empresa.banco.HerançaeException.conta.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		Conta[] c = new Conta[10];
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas abc = new AtualizadorDeContas(0.01);

		
		abc.roda(cc);
		abc.roda(cp);

		System.out.println("Saldo Total: " + abc.getSaldoTotal());

		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
