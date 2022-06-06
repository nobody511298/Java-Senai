import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		
		
		
				Scanner teclado = new Scanner(System.in); //chama o método Scanner 
				//cria uma lista da "variavel" mouse (pois foi encapsulado todos os atributos dentro de mouse) 
				ArrayList<Mouse> Periferico = new ArrayList();
				for (int x = 0; x < 3; x++) {
					
				
				Mouse mouse1 = new Mouse(); //estancia um novo objeto
				System.out.println("botoes"); 
				mouse1.setQtdBotoes(teclado.nextInt()); // recebe valores inseridos pelo usuario via método scanner
				System.out.println("funciona?");
				mouse1.setFunciona(teclado.nextBoolean());
				System.out.println("tamanho");
				mouse1.setTamanho(teclado.next());
				//adiciona os objetos de mouse à lista
				Periferico.add(mouse1);
				
				}
				
				//tenta gravar no hdd em arquivo txt oque será pedido em escrever.write
				
				try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Entrada.txt"))){
					
				//aponta para os objetos de mouse, converte para String e grava no arquivo .txt	
					for (Mouse mouse: Periferico) {
						escrever.write(mouse.toString());
					
					}
					try(BufferedReader reader = new BufferedReader(new FileReader("Entrada.txt"))){
						String line;
						String string = "";
						
						while((line = reader.readLine())!=null) {
							string += line + "\n";
							
						
						}
						System.out.println(string);
						
					}
					
		
		

	}
	}
}

