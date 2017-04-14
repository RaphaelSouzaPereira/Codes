package br.com.empresa.banco.Heran�aeException.sistema;

import br.com.empresa.banco.Heran�aeException.AtualizadorDeContas;
import br.com.empresa.banco.Heran�aeException.conta.Conta;
import br.com.empresa.banco.Heran�aeException.conta.ContaCorrente;
import br.com.empresa.banco.Heran�aeException.conta.ContaPoupanca;

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
