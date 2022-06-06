
public class ContaBancaria {
	 
	//cria variaveis privadas de v�rios tipos
	private	int numConta;
	private	boolean ativo;
	private	double saldo;
	
	//cria o m�todo contabancaria que seta os valores de ativo e saldo
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
		
	}
	
	
	// cria um m�todo que confere as informa��es de ContaBancaria
	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
	}


 //cria um m�todo para receber um valor do tipo double e adicionar ao saldo
	public void receber(double valor) {
		saldo += valor;
	}
	public double saldo() {
		return saldo;
	}
	//cria um m�todo para transferir valor do tipo double, onde cria uma condi��o que diz que o saldo deve ser maior que o valor a ser dado e logo ap�s subtrai esse valor do saldo.
	public void dar (double valor) {
		if(saldo>=valor) {
			saldo -= valor;
	}
	}
		
	}


