package fundamentosdejava;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int x= 100;
	//	double y= 200.9;
		//int a=0;
		//double b= 0;
		//short z = 10000;
	//	int idadePessoa = 88;
	//	if(idadePessoa < 18) {
	//		System.out.println("Voc� n�o pode beber"); 
	//		System.out.println("Voc� tem " + idadePessoa + " anos");
	//	}else if(idadePessoa <60) {
	//	System.out.println("B� beber");
	//	System.out.println("Voc� tem " + idadePessoa + " anos");
		//}
		//else{
			//System.out.println("Voc� est� definhando, n�o deve beber!!");
		//	System.out.println("Voc� tem " + idadePessoa + " anos");
	//	}
//		int num = 8;
//		
//		switch (num) {
//		case 1:
//			System.out.println("Hoje � Domingo" );
//			break;
//		case 2:
//			System.out.println("Hoje � Segunda" );
//			break;
//		case 3:
//			System.out.println("Hoje � Ter�a" );
//			break;
//		case 4:
//			System.out.println("Hoje � Quarta" );
//			break;
//		case 5:
//			System.out.println("Hoje � Quinta" );
//			break;
//		case 6:
//			System.out.println("Hoje � Sexta" );
//			break;
//		case 7:
//			System.out.println("Hoje � S�bado" );
//			break;
//			default:
//				System.out.println("esse dia n�o representa um dia da semana");
//			
//		}
//		int x=0;
////		while(x<10) {
////			System.out.println(x);
////			x=x+1;
////		}
//		do {
//			System.out.println(x);
//			x=x+1;
//			
//			
//		}
//		while(x<10);
		
		//a = (int) y; //casting
		//b = x;
		
		//System.out.println(x);
//		System.out.println(y);
//		System.out.println(a);
		//System.out.println(b);
		//System.out.println(z);
		
		//switch () {
		//case : 
		//break;
//		
//		char caractere = 'a';
//		switch(caractere ) {
//		case 'a':
//			System.out.println("seu caractere � a");
//			break;
//		case 'b':
//	//		System.out.println("seu caractere � b");
//	//		break;
//	//		default: System.out.println("Sua escolha n�o � v�lida");
//	//	}
	//	for (int x=0; x<10; x++) {
	//		System.out.println(x);
	//	}
		
		//scanner � usado para receber informa��es pelo teclado
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero qualquer");
		//insere o valor na variavel y
		int y = entrada.nextInt();
		for(int x=0; x<=10; x++) {
			System.out.println(y + " x " + x + " = " + x*y);
		}
		
	}

}
//}
