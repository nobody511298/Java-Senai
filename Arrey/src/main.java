import java.util.Scanner; //importa a biblioteca scanner para receber valores do usu�rio 

public class main {

	public static void main(String[] args) {
	
		int x1 = 3;
		int y1 = 5;
		int z1 = 7;
		
		//imprime no monitor serial os valores de x1;z1 e y1
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		
		//"double x []" cria uma matriz do tipo double intitulada x
		double x [] = {3, 5, 3, 5};
		
		//cria um loop at� que a condi��o da express�o se torne falsa/verdadeira
		
		for (int aux = 0; aux < x.length; aux++) {
			System.out.println("Valor do �ndice " + aux + " = " + x[aux]);
		}
		String nome[] = { "Rafael", "Lara", "Gislene"};
		
		//cria um loop at� que a condi��o da express�o se torne falsa/verdadeira
		
		for (int aux1 = 0; aux1 < nome.length; aux1++) {
			System.out.println(nome[aux1]);
			
			//cria uma condi��o de que se o atributo nome for igual a "Gislene" o sistema imprime no monitor o conte�do dentro
			//de Syso[...]
			if (nome[aux1] == "Gislene") {
				System.out.println("O �ndice de Gislene � = " + aux1);
			}
		}
		//cria vari�s matrizes de v�rios tipos (int;String e double)
		int [] arrayInt = new int[5];
		String [] ArrayString = new String[4];
		double[] ArrayDouble = new double[3];
		
		arrayInt[3] = 4;
		
		int[] numero = new int [6];
		Scanner teclado = new Scanner(System.in);
		
		//todos os for criam um loop at� que a condi��o da express�o se torne falsa/verdadeira
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Digite um n�mero qualquer");
			numero[aux2] = teclado.nextInt();
		}
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("�ndice " +aux2+ " = " + numero[aux2]);
		}
		int[] arrayQualquer = new int [3];
		Object[] arrayObject = new Object[6];
		
		//coloca valores dentro da matriz
		
		arrayObject[0] = 12;
		arrayObject[1] = "Rafael";
		arrayObject[2] =13.8;
		arrayObject[3] = true;
		arrayObject[5] = arrayQualquer;
		
		//cria um loop at� que a condi��o da express�o se torne falsa/verdadeira
		
		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
			System.out.println("Indice " + aux2+ " = " + arrayObject[aux2]);
			}
		int[][] arrayBidirecional = new int[4][3];
		arrayBidirecional[0][0]=8;
		arrayBidirecional[2][1]=7;
		
		//cria um loop at� que a condi��o da express�o se torne falsa/verdadeira
		
		for (int linha = 0; linha <arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna <arrayBidirecional[0].length; coluna++) {
				System.out.println("Indice [" +linha+ "]["+coluna+"] = " + arrayBidirecional[linha][coluna]+ "");
			}
			
			//pula uma linha
			
			System.out.println();
			}
		}
  		}
	

	

	
