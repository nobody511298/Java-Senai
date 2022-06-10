import java.util.Scanner;

public class main {

	public static final double PI = 3.14;
	
	private enum Sexo{
		MASCULINO,FEMININO;
		
	}
	
	public static void main(String[] args) {

	double	pi = main.PI;
		
		//seta dia da semana como SEGUNDA
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		hoje =  DiaDaSemana.valueOf (s);
		
		System.out.println(hoje.getNum());
		
		// seta sexo como feminino chamandp o ENUM sexo e a variavel feminino
		Sexo sexo = Sexo.FEMININO;
		 sexo = Sexo.MASCULINO;
		

		
			//cria uma nova array como denominadas linhas e diversos tipos
			int[] arrayInt = new int [5];
			String[] ArrayString = new String [4];
			double[] ArrayDouble = new double[3];
			
			arrayInt[3] = 4;
			int[] numero = new int [6];
			Scanner teclado = new Scanner(System.in);

			for (int aux2 = 0; aux2 < numero.length; aux2++) {
				System.out.println("digite um numero Qualquer");
				numero[aux2] = teclado.nextInt();
			}
			
			
			for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Indice " +aux2+ " = " + numero [aux2]);
				
			}
			
	}

}
