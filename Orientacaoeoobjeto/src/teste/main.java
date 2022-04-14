package teste;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Adrian";
		pessoa1.numFig = 1;

		pessoa1.receber(4);

		System.out.println("Inicialmente, " + pessoa1.nome + " tem " + pessoa1.numFig + " figurinhas");

		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Nathy";
		pessoa2.numFig = 3;
		System.out.println(pessoa2.nome + " tem " + pessoa2.numFig + " figurinhas");
		

		pessoa2.dar(5, pessoa1);

		if .dar = true) {
		System.out.println("Quantidade final de figurinhas de " + pessoa1.nome + " é de " + pessoa1.numFig);
		System.out.println("E " + pessoa2.nome + " ficou com " + pessoa2.numFig + " figurinhas");
		}
	}

}
