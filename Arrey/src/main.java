
public class main {

	public static void main(String[] args) {
	
		int x1 = 3;
		int y1 = 5;
		int z1 = 7;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);

		double x [] = {3, 5, 3, 5};
		
		for (int aux = 0; aux < x.length; aux++) {
			System.out.println("Valor do índice " + aux + " = " + x[aux]);
		}
		String nome[] = { "Rafael", "Lara", "Gislene"};
		
		for (int aux1 = 0; aux1 < nome.length; aux1++) {
			System.out.println(nome[aux1]);
			if (nome[aux1] == "Gislene") {
				System.out.println("O índice de Gislene é = " + aux1);
			}
		}
		
		int [] arrayInt = new int[5];
		String [] ArrayString = new String[4];
		double[] ArrayDouble = new double[3];
		
		arrayInt[3] = 4;
		
		int[] numero = new int [6];
		Scanner teclado = new Scanner(System.in);
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Digite um número qualquer");
			numero[aux2] = teclado.nextInt();
		}
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Índice " +aux2+ " = " + numero[aux2]);
		}
  		}

	}

	
