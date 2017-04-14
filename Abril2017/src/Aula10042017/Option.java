package Aula10042017;

public class Option {
	
	private String label;
	private Action action;

	public Option(String Label){
		this.label = label;
	}

	public void setAction(Action action) {
		this.action = action;
		
	}

	public Boolean executeIf(String input) {
		if(input.equalsIgnoreCase(label)){
			action.execute();
			return true;
		}else{
			return false;
		}
		
	}

	public void show() {
		
		
	}
	

}
