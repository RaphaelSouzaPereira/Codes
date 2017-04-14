package Lang;

import java.io.PrintStream;

import br.com.empresa.banco.HerançaeException.conta.Conta;

public class TestaInteger {

	private static final String numero = null;
	private static final String nome = null;

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);

	    if (x1 == x2) {
	        System.out.println("igual");
	    } else {
	        System.out.println("diferente");
	    }
	    
	    PrintStream saida = System.out;
	    saida.println("Ola");
	}

    @Override
    public boolean equals(Object obj) {
        Conta outra = (Conta) obj;
        return     this.numero == outra.numero && 
                this.nome.equals(outra.nome);
    }
    
   
    
    
    
    
}


