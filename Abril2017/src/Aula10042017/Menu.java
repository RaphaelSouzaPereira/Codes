package Aula10042017;

import com.senac.SimpleJava.Console;

public class Menu {

	private static final int MAX_OPTIONS = 10;
	private Option[] options;
	private String title;
	private int numOptions;
	
	public Menu(){
		options = new Option(MAX_OPTIONS);
		numOptions = 0;
		title = "";
	}
	

	public void execute() {
		show();
		waitInputAndExecute();
		
		
	}

	private void waitInputAndExecute() {
		String opcao = Console.readString("#>");
		for(int i = 0; i < numOptions; i++){
			if (options[i].executeIf(opcao)){
				return;
			}
		}
	}

	private void show() {
		Console.println(title);
		for(int i = 0; i < numOptions; i++){
			options[i].show();
		}
		
	}

	public void setTitle(String title) {
		this.title = title;
		
	}

	public void addOption(Option option) {
		if(numOptions < MAX_OPTIONS && option != null){
		options[numOptions] = option;
		numOptions++;
		}
	}



	
}
