package br.com.empresa.banco.HerançaeException;

public class ValorInvalidoException extends RuntimeException {
//ou extends Exception para deposita diferente na conta como comentário {
	
	 public ValorInvalidoException(double valor) {
         super("Valor invalido: " + valor);
     }
	 
	 ValorInvalidoException(){
		System.out.println("ERRO");
	 }
}
