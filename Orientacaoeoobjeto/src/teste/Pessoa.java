package teste;

public class Pessoa {
	String nome; // var
	int numFig; // var

	void receber(int numFig) {

		this.numFig += numFig; //chamar variavel da public class pessoa e adiciona mais fig
	}

	boolean dar(int numFig, Pessoa pessoa) {

		
		
		if (this.numFig < numFig) {
			System.out.println("***Não é possível realizar a troca, você não tem figurinhas suficientes.***");
			return false;
		}
		
		else {
			this.numFig -= numFig;
			pessoa.receber(numFig);
			return true;
			
		}
	}
}