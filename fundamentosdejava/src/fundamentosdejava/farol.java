package fundamentosdejava;

public class farol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cria uma String denominada farol que tem o "valor" de "vermelho"
		String farol = "vermelho";

		//cria uma condição onde se algo for verdadeiro, ele realiza a linha dentro de case; caso o contrário ele pula para
		//a próxima comparação. quase igual um if else; o break é usado para finalizar o loop
		switch(farol) {
		case "verde":
			System.out.println("Siga em frente");
			break;
		case "amarelo":
			System.out.println("Diminua a velocidade");
			break;
		case "vermelho":
			System.out.println("Pare !!");
			break;
			default : 
				System.out.println("Valor inválido");
  
	}
	}
}
