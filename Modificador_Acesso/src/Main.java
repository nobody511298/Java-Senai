
public class Main {

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
//		System.out.println(conta1.saldo());
//		
//		ContaBancaria conta2 = new ContaBancaria();
//		System.out.println(conta2.saldo());
		
		//estancia novo objeto de Cliente
		
		Cliente cliente1 = new Cliente();
		
		//seta as informa��es da conta usando o metodo set
		cliente1.setNome("ADRIAN");
		cliente1.setCpf(123456);
		cliente1.setNumConta(654321);
		
		
		System.out.println(cliente1.toString());
		
		//faz a mesma coisa de cliente1, apenas alterando as informa��es pessoais
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("ADRIAN");
		cliente2.setCpf(12345);
		cliente2.setNumConta(654321);
		
		System.out.println(cliente2);
		
		// if(cliente1.getNome()==cliente2.getNome()) { verifica se o nome do cliente � igual 
//			System.out.println("os objetos s�o iguais");
//		}
//		else {
//			System.out.println("os objetos s�o diferentes");
//		}
		if(cliente1.equals(cliente2)) {
			System.out.println("os objetos s�o iguais");
		}
		else {
			System.out.println("os objetos s�o diferentes");
		}
			
		}
	}


