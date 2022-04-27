
public class main {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
		
//		conta1.ativo = true;
//		conta1.saldo = 100.50;
//		conta1.numConta = 1234;
		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.saldo);
//		System.out.println(conta1.numConta);
//		conta1.receber(100.8);
//		conta1.dar(40);
		System.out.println(conta1.saldo());
		
		ContaBancaria conta2 = new ContaBancaria();
		System.out.println(conta2.saldo());

	}

}
