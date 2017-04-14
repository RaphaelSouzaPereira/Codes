package Aula07112016;

public class Pessoa02Ivonei {
	private String nome;
	private double salario;
	private int idade;
	private char sexo;

	public Pessoa02Ivonei(String nome) {
		setNome(nome);
	}

	//------------------------------------nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean finaliza() {
		if (nome.equals("fim"))
			return true;
		return false;
	}

	//----------------------------------Salario
	public double getSalario() {
		return salario;
	}

	public void setSalario(String stSalario) {
		this.salario = converteSalario(stSalario);
	}
	
	private double converteSalario(String stSalario) {
		try {
			return Double.parseDouble(stSalario);
		}catch(Exception erro){
			System.out.println("\nErro. Salário não válido.");
		}	
		return 0;
	}

	public boolean salarioOk() {
		if (salario > 0)
			return true;
		return false;
	}

	//----------------------------------idade
	public int getIdade() {
		return idade;
	}

	public void setIdade(String stIdade) {
		this.idade = converteIdade(stIdade);
	}

	private int converteIdade(String stIdade) {
		try {
			return Integer.parseInt(stIdade);
		}catch(Exception erro){
			System.out.println("\nErro. Idade não válida.");
		}	
		return 0;
	}

	public boolean idadeOk() {
		if (idade > 0)
			return true;
		return false;
	}

	//-------------------------------------sexo
	public char getSexo() {
		return sexo;
	}

	public void setSexo(String stSexo) {
		this.sexo = converteSexo(stSexo);
	}

	private char converteSexo(String stSexo) {
		stSexo = stSexo.toUpperCase();
		if(stSexo.equals("F") || stSexo.equals("M"))
			return stSexo.charAt(0);
		return ' ';
	}

	public boolean sexoOk(){
		if (sexo == 'F' || sexo == 'M')
			return true;
		return false;
	}

}
