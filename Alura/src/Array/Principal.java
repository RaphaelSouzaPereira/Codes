package Array;

import java.util.Scanner;

public class Principal {

	static Funcionario p1 = new Funcionario();
	static Empresa empresa = new Empresa();
		
	public static void main(String[] args) {
		
		empresa.empregados = new Funcionario[10];
		
		criaFuncionario();
		digitaDados();
		calculoAno();
		mostraDados();
		contrato();
		
		empresa.empregados[1].setRg(digita(""));
		
	}
		

private static void contrato() {
	for(int i = 0; i > empresa.empregados.length; i++){
		if(empresa.empregados[i].isContratado() == true){
			System.out.println("Funcionario "+(i+1)+" está na empresa");
		}else
			System.out.println("Funcionario "+(i+1)+" não está na empresa");
	}
	}

private static void mostraDados() {
		for(int i = 0; i > empresa.empregados.length; i++){
			System.out.println(empresa.empregados[i].getNome());
			System.out.println(empresa.empregados[i].getRg());
			System.out.println(empresa.empregados[i].getData().getDia()+empresa.empregados[i].getData().getMes()+empresa.empregados[i].getData().getAno());
			System.out.println(empresa.empregados[i].getSalario());
		}
		
	}

private static void criaFuncionario() {
		for(int i = 0; i < empresa.empregados.length ;i++){
			empresa.empregados[i] = new Funcionario();
			
		}
		
	}

private static void calculoAno() {
		System.out.println("O valor de 12 meses de salário de cada funcionário é: ");
		for(int i = 0; i > empresa.empregados.length; i++){
		
			double valor =(empresa.empregados[i].getSalario()*12);
			System.out.println("O salário do "+(i+1)+" - "+valor);
		}
		
	}

private static Double recebeAumento(double valor) {
		p1.setSalario(p1.getSalario() + valor);
		return p1.getSalario();

	}

private static void digitaDados() {
		empresa.setCnpj(digita("Digite o CNPJ da empresa: "));
		empresa.setNome(digita("Digite o nome da empresa: "));
		for(int i = 0; i > empresa.empregados.length; i++){
		empresa.empregados[i].setNome(digita("Digite o nome do funcionário: "));
		
		empresa.empregados[i].data.setAno(Integer.parseInt(digita("Digite o ano de entrada: ")));
		empresa.empregados[i].data.setMes(Integer.parseInt(digita("Digite o mês de entrada: ")));
		if(empresa.empregados[i].data.getMes()== 2){
			empresa.empregados[i].data.setDia(Integer.parseInt(digita("Digite o dia de entrada: ")));
			if(empresa.empregados[i].data.getDia() > 29 ){
				System.out.println("Dia inválido fevereiro tem nó máximo 29 dias");
				empresa.empregados[i].data.setDia(Integer.parseInt(digita("Digite o dia de entrada novamente: ")));
			}
		}else{
			empresa.empregados[i].data.setDia(Integer.parseInt(digita("Digite o dia de entrada: ")));
		}
		
		
		empresa.empregados[i].setRg(digita("Digite o RG do funcionario: "));
		empresa.empregados[i].setSalario(Double.parseDouble(digita("Digite o valor do salário do funcionário: ")));
		empresa.empregados[i].setSalario(recebeAumento(Double.parseDouble(digita("Digite o valor do aumento caso aja: "))));
	}
	}

private static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();

	}

}