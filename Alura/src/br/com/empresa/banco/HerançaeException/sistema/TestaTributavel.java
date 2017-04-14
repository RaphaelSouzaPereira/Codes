package br.com.empresa.banco.HerançaeException.sistema;

import br.com.empresa.banco.HerançaeException.Tributavel;
import br.com.empresa.banco.HerançaeException.conta.ContaCorrente;

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
