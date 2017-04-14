package Aula03042017;

import java.awt.Menu;

public class MenuOrientadoaObjetos {
	
	public void run(){
		Menu menu = criarMenu();
		while(true){
			menu.executar();
		
		}
	}
	private Menu criarMenu() {
		
		Menu menu = new Menu();
		//criar a opção
		Opcao cadastrar = new Opcao("Cadastrar");
		//configurar a opcao com a acao
		cadastrar.setAcao(new Acao("Cadastrar"));
		//adicionar a opcao ao menu
		menu.addOpcao(cadastrar);
		
		Opcao listar = new Opcao("Listar");
		listar.setAcao(new Acao("Listar"));
		menu.addOpcao(listar);
		
		Opcao remover = new Opcao("Remover");
		remover.setAcao(new Acao("Remover"));
		menu.addOpcao(remover);
		
		Opcao sair = new Opcao("Sair");
		sair.setAcao(new Acao("Sair"));
		menu.addOpcao(sair);
		
		return menu;
	
	}


}
