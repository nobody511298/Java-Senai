package fundamentosdejava;

public class farol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String farol = "vermelho";

		
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
