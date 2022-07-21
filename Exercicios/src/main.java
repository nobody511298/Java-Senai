import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario ();
		Funcionario funcionario2 = new Funcionario ();
		
		System.out.println("Digite o nome do Funcionario 1");
		funcionario1.setNome(teclado.next());
		System.out.println("Digite o nome do Funcionario 2");
		funcionario2.setNome(teclado.next());
		System.out.println("Digite o maior salário");
		funcionario1.setSalario(teclado.nextInt());
		System.out.println("Digite o menor salário");
		funcionario2.setSalario(teclado.nextInt());
		System.out.println("A diferença entre os salarios é de:");
		
		//Tentei colocar um método aqui nessa parte mas nao consegui puxar os dados de cada funcionario pra fazer o método,
		//então improvisei aqui mesmo.
		System.out.println("R$ " + (funcionario1.getSalario()-funcionario2.getSalario()));
		
		System.out.println("\n");
		
		/////////////////////////////////////////////////////////////////
		ProgramaRevisao valor = new ProgramaRevisao ();
		ProgramaRevisao desc = new ProgramaRevisao ();
		
		System.out.println("Calculadora de descontos!");
		System.out.println("Para começar, digite o valor sobre o qual quer dar desconto");
		valor.setValor(teclado.nextDouble());
		System.out.println("Agora, digite a quantidade de desconto em porcentagem (% - de 0 à 100)");
		desc.setDesc(teclado.nextDouble());
		System.out.println("O valor do desconto será de R$ " + (valor.getValor()* desc.getDesc() / 100));
		
		
		System.out.println("\n");
		
		//////////////////////////////////////////////////////////////////
		
		
		
	}

}
