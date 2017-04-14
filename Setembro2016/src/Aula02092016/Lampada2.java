package Aula02092016;

public class Lampada2 {
	private boolean lampada;

	public void setLampada() {
		this.lampada = ! this.lampada;
	}//----------------
	
	public String statusLampada(){
		if (lampada)
			return "....Lampada Ligada.";
		return "....Lampada Desligada.";
	}//-------------------
}//final classe
