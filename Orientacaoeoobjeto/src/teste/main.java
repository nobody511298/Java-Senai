package teste;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cria pessoa 1
		Pessoa pessoa1 = new Pessoa();
		//seta o nome de pessoa1 para Adrian
		pessoa1.nome = "Adrian";
		//seta o numero de figurinhas de pessoa 1 para 1 fig
		pessoa1.numFig = 1;

		//chama o metodo receber de pessoa para pessoa 1, recebendo 4 fig
		pessoa1.receber(4);

		//imprime na tela o texto concatenado de informações
		System.out.println("Inicialmente, " + pessoa1.nome + " tem " + pessoa1.numFig + " figurinhas");

		//cria nova pessoa, da nome e quantidade de figurinhas para ela
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Nathy";
		pessoa2.numFig = 3;
		System.out.println(pessoa2.nome + " tem " + pessoa2.numFig + " figurinhas");
		
		//pessoa2 da 2 fingurinhas para pessoa1 
		pessoa2.dar(2, pessoa1);

		//aqui cria uma condição, onde se a pessoa 2 der figurinhas para a pessoa1, o console imprime o seguinte texto:
		if (pessoa2.dar(pessoa2.numFig, pessoa2) == true) {
		System.out.println("Quantidade final de figurinhas de " + pessoa1.nome + " é de " + pessoa1.numFig);
		System.out.println("E " + pessoa2.nome + " ficou com " + pessoa2.numFig + " figurinhas");
		}
	}

}
