package Aula16092016;

public class Porta {

	private double Altura= 2.10, Largura=0.8;
	private String Cor = "Nenhuma"; 
	private boolean StatusPorta = true; 
	
	
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		this.Altura = Altura;
	}
	public double getLargura() {
		return Largura;
	}
	public void setLargura(double largura) {
		this.Largura = Largura;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		this.Cor = cor;
	}
	public void setStatusPorta(boolean StatusPorta) {
		this.StatusPorta = StatusPorta;
		
	}
	public boolean getStatusPorta(){
	return StatusPorta;
	}

	
}
