import java.util.ArrayList;
import java.util.List;

public class Pessoa{
	
	//cria variaveis privadas
	private int idade;
	private String nome;
	private Endereco endereco;
	private Sexo sex;
	
	//m�todo get e set para inserir e visualizar dados
	
		
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

		
		//to string para converter de endere�o para string
		
		@Override
		public String toString() {
			return "Pessoa [idade=" + idade + ", nome=" + nome + ", endereco=" + endereco + ", sex=" + sex + "]"+"\n";
		}
		
		
	
		
		
		
		

		
	
}
