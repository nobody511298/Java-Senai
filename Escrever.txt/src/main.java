//importa bibliotecas para o programa funcionar corretamente

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) throws IOException {
		
		
		//estancia objetos da classe mouse e da valor aos atributos dela
		Mouse mouse1 = new Mouse(false, 5, "85");
		Mouse mouse2 = new Mouse(true, 2, "25");
		Mouse mouse3 = new Mouse(true, 4, "30");
		
		//cria uma lista da "variavel" mouse (pois foi encapsulado todos os atributos dentro de mouse) 
		ArrayList<Mouse> Periferico = new ArrayList();
		
		//adiciona os objetos de mouse à lista
		
		Periferico.add(mouse1);
		Periferico.add(mouse2);
		Periferico.add(mouse3);
		
		
		//tenta gravar no hdd em arquivo txt oque será pedido em escrever.write
		
		try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Saida.txt"))){
			
		//aponta para os objetos de mouse, converte para String e grava no arquivo .txt	
			for (Mouse mouse: Periferico) {
				escrever.write(mouse.toString());
			
			}
		}
	}

}
