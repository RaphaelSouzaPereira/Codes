package br.com.empresa.banco.Heran�aeException.sistema;

import br.com.empresa.banco.Heran�aeException.GerenciadorDeImpostoDeRenda;
import br.com.empresa.banco.Heran�aeException.SeguroDeVida;
import br.com.empresa.banco.Heran�aeException.conta.ContaCorrente;

public class TestaGerenciadorDeImpostoDeRenda  {

	public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo �: %.2f", cc.getSaldo());
    }

}
