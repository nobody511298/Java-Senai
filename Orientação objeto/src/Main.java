import java.util.Scanner;

public class Main {

@@ -29,6 +30,25 @@ public static void main(String[] args) {
			}
		}

		int[] arrayInt = new int[5]; //criaçao de conteudo linhas vazias
		String[]arraStrings = new String[4];
		double[] ArrayDouble = new double [3];

		arrayInt[3] = 4;

		int[] numero = new int[6];
		Scanner teclado = new Scanner(System.in);

		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println(" Digite um numero qualquer ");
			numero[aux2] = teclado.nextInt();

			}

		for (int aux2=0; aux2 < numero.length; aux2++){
		System.out.println(" Indice " + aux2 +  " = " + numero[aux2]);

		}	

	}
