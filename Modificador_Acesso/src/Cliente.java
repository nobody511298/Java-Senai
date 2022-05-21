import java.util.Objects;

public class Cliente {
	
	//cria variaveis privadas
	private String nome;
	private int cpf;
	private  int numConta;
	
	
	public Cliente() {
		
	}
	
	//método get para mandar informações do nome
	
	public String getNome() {
		return nome;
	}
	
	//metodo set para receber informações do nome
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//método get para mandar informações do cpf
	
	public int getCpf() {
		return cpf;
	}
	
	//método get para receber informações do cpf
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	//subescreve o  
	@Override
	public String toString() {
		return "Cliente:\nNome= " + nome + ",\nCPF= " + cpf + ",\nNúmero da Conta= " + numConta ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	

}
