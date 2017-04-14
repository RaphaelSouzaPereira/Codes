package Aula10042017;

public class SistemaMenu {
	public void run() {
		Menu menu = createMenu();
		do{
		menu.execute();
		}while (true);
		
		
	}

	private Menu createMenu() {
		Menu menu = new Menu();
		menu.setTitle("Menu Principal");
		
		String[] opcoes = {"Cadastrar","Listar","Remover","Sair"};
		
		
		for(String option : opcoes){
		Option option = new Option("Cadastrar");
		
		Action action = new Action("Cadastrar");
		
		option.setAction(action);
		
		menu.addOption(option);
		
		return menu;
		}
	}

}
