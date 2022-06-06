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
	//		System.out.println("Você não pode beber"); 
	//		System.out.println("Você tem " + idadePessoa + " anos");
	//	}else if(idadePessoa <60) {
	//	System.out.println("Bó beber");
	//	System.out.println("Você tem " + idadePessoa + " anos");
		//}
		//else{
			//System.out.println("Você está definhando, não deve beber!!");
		//	System.out.println("Você tem " + idadePessoa + " anos");
	//	}
//		int num = 8;
//		
//		switch (num) {
//		case 1:
//			System.out.println("Hoje é Domingo" );
//			break;
//		case 2:
//			System.out.println("Hoje é Segunda" );
//			break;
//		case 3:
//			System.out.println("Hoje é Terça" );
//			break;
//		case 4:
//			System.out.println("Hoje é Quarta" );
//			break;
//		case 5:
//			System.out.println("Hoje é Quinta" );
//			break;
//		case 6:
//			System.out.println("Hoje é Sexta" );
//			break;
//		case 7:
//			System.out.println("Hoje é Sábado" );
//			break;
//			default:
//				System.out.println("esse dia não representa um dia da semana");
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
//			System.out.println("seu caractere é a");
//			break;
//		case 'b':
//	//		System.out.println("seu caractere é b");
//	//		break;
//	//		default: System.out.println("Sua escolha não é válida");
//	//	}
	//	for (int x=0; x<10; x++) {
	//		System.out.println(x);
	//	}
		
		//scanner é usado para receber informações pelo teclado
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número qualquer");
		//insere o valor na variavel y
		int y = entrada.nextInt();
		for(int x=0; x<=10; x++) {
			System.out.println(y + " x " + x + " = " + x*y);
		}
		
	}

}
//}
