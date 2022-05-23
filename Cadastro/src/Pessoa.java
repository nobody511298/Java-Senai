import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private int idade;
	private String nome;
	private String endereco;
	
	
		public int getIdade() {
			return idade;
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
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		@Override
		public String toString() {
			return "Pessoa [idade=" + idade + ", nome=" + nome + ", endereco=" + endereco + "]";
		}
		
		

		
	
}
