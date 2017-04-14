package br.com.empresa.banco.HerançaeException.sistema;

import br.com.empresa.banco.HerançaeException.GerenciadorDeImpostoDeRenda;
import br.com.empresa.banco.HerançaeException.SeguroDeVida;
import br.com.empresa.banco.HerançaeException.conta.ContaCorrente;

public class TestaGerenciadorDeImpostoDeRenda  {

	public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %.2f", cc.getSaldo());
    }

}
