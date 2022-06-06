import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	// cria variaveis privadas
	private String nome;
	private int idade;
	private Sexo sex;

	private Endereco endereco;

	// m�todo get e set para inserir e visualizar dados
	

	public Pessoa(String linha) {
		
		String[] arrayLinha = linha.split(",");
		String[] arrayNome = arrayLinha[0].split("=");
		this.nome = arrayNome[1].trim();
		
		String[] arrayIdade = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arrayIdade[1].trim());
		
		
		Endereco endereco =  new Endereco(arrayLinha);
		this.endereco = endereco;
		
	}
	

	public Pessoa() {
	}



	public int getIdade() {
		return idade;
	}

	public Sexo getSex() {
		return sex;
	}

	public void setSex(Sexo sex) {
		this.sex = sex;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	// to string para converter de endere�o para string

	@Override
	public String toString() {
		return "Pessoa: nome= " + nome + ", idade=" + idade + ", sex=" + sex + ", endereco=" + endereco + "\n" ;
	}
}
