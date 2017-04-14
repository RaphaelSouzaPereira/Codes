package Aula03042017;

public class Menu {
	
	public void executar(){
		exibir();
		tratarEntradaDoUsuario();
	}

	private void tratarEntradaDoUsuario() {
	}

	private void exibir() {
		for(Opcao op : opcoes ){
			opcoes.exibir();
		}
	}
	
	
}
