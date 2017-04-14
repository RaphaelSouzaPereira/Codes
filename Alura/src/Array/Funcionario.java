package Array;

public class Funcionario {
	
	
	String nome,rg;
	Double salario;
	Data data;
	boolean contratado = true;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String toString(){
		
		return "Nome: "+nome+"\nData: "+data.dia+"/"+data.mes+"/"+data.ano+"\nRG: "+rg+"\nSalário: "+salario;
	}
	public boolean isContratado() {
		return contratado;
	}
	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}
	
}
