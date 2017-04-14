package br.com.empresa.banco.Heran�aeException.sistema;

import br.com.empresa.banco.Heran�aeException.Tributavel;
import br.com.empresa.banco.Heran�aeException.conta.ContaCorrente;

public class TestaTributavel {
	public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
    }

}
