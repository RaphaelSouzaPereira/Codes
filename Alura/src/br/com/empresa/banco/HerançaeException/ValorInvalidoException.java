package br.com.empresa.banco.Heran�aeException;

public class ValorInvalidoException extends RuntimeException {
//ou extends Exception para deposita diferente na conta como coment�rio {
	
	 public ValorInvalidoException(double valor) {
         super("Valor invalido: " + valor);
     }
	 
	 ValorInvalidoException(){
		System.out.println("ERRO");
	 }
}
