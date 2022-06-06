package teste;

public class Pessoa {
	String nome; // var
	int numFig; // var

	//cria um m�todo para que pessoa receba figurinhas e adiciona dentro de numFig 
	void receber(int numFig) {

		this.numFig += numFig; //chamar variavel da public class pessoa e adiciona mais fig
	}

	//cria o metodo dar para dar figurinhas de pessoa para pessoa
	boolean dar(int numFig, Pessoa pessoa) {

		
		//cria condi��o onde se o numero de figurinhas que a apessoa estiver tentando dar for maior doque a quantidade de figurinhas que ela tem, o sistema n�o realiza o 
		//processo e imprime a seguinte mensagem:
		if (this.numFig < numFig) {
			System.out.println("***N�o � poss�vel realizar a troca, voc� n�o tem figurinhas suficientes.***");
			return false;
		}
		//caso a pessoa tenha quantidade suficiente, o sistema subtrai o valor dado e adiciona no do destinat�rio
		else {
			this.numFig -= numFig;
			pessoa.receber(numFig);
			return true;
			
		}
	}
}