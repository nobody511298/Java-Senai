import java.util.Scanner;
import java.util.ArrayList;


public class Main {

public static void main(String[] args) {
			
		

		int[] arrayInt = new int[5]; //criaçao de conteudo linhas vazias
		String[]arrayStrings = new String[4]; //cria uma array do tipo String 
		double[] ArrayDouble = new double [3]; // cria uma Array do tipo double

		arrayInt[3] = 4;

		int[] numero = new int[6];
		Scanner teclado = new Scanner(System.in); // insere metodo do scanner nomeado de teclado

		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println(" Digite um numero qualquer ");
			numero[aux2] = teclado.nextInt();

			}

		for (int aux2=0; aux2 < numero.length; aux2++){
		System.out.println(" Indice " + aux2 +  " = " + numero[aux2]);

		}	

	}
}
