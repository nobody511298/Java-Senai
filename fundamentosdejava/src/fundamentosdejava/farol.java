package fundamentosdejava;

public class farol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cria uma String denominada farol que tem o "valor" de "vermelho"
		String farol = "vermelho";

		//cria uma condi��o onde se algo for verdadeiro, ele realiza a linha dentro de case; caso o contr�rio ele pula para
		//a pr�xima compara��o. quase igual um if else; o break � usado para finalizar o loop
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
				System.out.println("Valor inv�lido");
  
	}
	}
}
