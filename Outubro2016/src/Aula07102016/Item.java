package Aula07102016;

public class Item {
	
	public int quantidade ;
	public String nomeProduto;
	public boolean comprado = false;
	
	public int getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNomeProduto() {
		return this.nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public boolean getComprado() {
		return this.comprado;
	}
	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}

	public String toString(){
		return "O produto "+nomeProduto+" e suas "+quantidade+" unidades ";
		
	}

}
