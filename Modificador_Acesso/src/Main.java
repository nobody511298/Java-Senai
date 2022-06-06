
public class Main {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
		
//		conta1.ativo = true; //diz que a conta 1 esta ativa
//		conta1.saldo = 100.50; //seta o saldo da conta1
//		conta1.numConta = 1234; // seta o numero da conta de conta1
		
//		System.out.println(conta1.ativo); //printa as informações da conta no console
//		System.out.println(conta1.saldo);
//		System.out.println(conta1.numConta);
//		conta1.receber(100.8); // chama o método receber de conta e adiciona o valor de 100.8 à conta1
//		conta1.dar(40); //chama o método dar de conta e transfere o valor de 40$ da conta1
//		System.out.println(conta1.saldo());// printa no console o saldo
//		
//		ContaBancaria conta2 = new ContaBancaria(); // cria uma nova conta bancaria
//		System.out.println(conta2.saldo());
		
		//estancia novo objeto de Cliente
		
		Cliente cliente1 = new Cliente();
		
		//seta as informações da conta usando o metodo set
		cliente1.setNome("ADRIAN");
		cliente1.setCpf(123456);
		cliente1.setNumConta(654321);
		
		//chama o método toString de cliente para mostrar as informações em forma de String
		System.out.println(cliente1.toString());
		
		//faz a mesma coisa de cliente1, apenas alterando as informações pessoais
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("ADRIAN");
		cliente2.setCpf(12345);
		cliente2.setNumConta(654321);
		
		System.out.println(cliente2);
		
		// if(cliente1.getNome()==cliente2.getNome()) { verifica se o nome do cliente é igual 
//			System.out.println("os objetos são iguais");
//		}
//		else {
//			System.out.println("os objetos são diferentes");
//		}
		if(cliente1.equals(cliente2)) {
			System.out.println("os objetos são iguais");
		}
		else {
			System.out.println("os objetos são diferentes");
		}
			
		}
	}


