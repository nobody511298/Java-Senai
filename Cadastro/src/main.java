import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		
		//insere scanner
		Scanner entrada = new Scanner(System.in);
		
		//cria novas listas
		List lista = new ArrayList();
		List lista2 = new ArrayList();
		List lista3 = new ArrayList();
		
		
		
		
		Pessoa pessoa1 = new Pessoa ();
		
		//colocar sistema *for*
		
	
	
			
		System.out.println("Insira o nome");
		pessoa1.setNome(entrada.next());
		System.out.println("Insira o endereço");
		pessoa1.setEndereco(entrada.next());
		System.out.println("Insira a idade");
		pessoa1.setIdade(entrada.nextInt());
		System.out.println("Cadastrado com sucesso");
		System.out.println();
				
		Pessoa pessoa2 = new Pessoa ();
		
		System.out.println("Insira o nome");
		pessoa2.setNome(entrada.next());
		
		System.out.println("Insira o endereço");
		pessoa2.setEndereco(entrada.next());
		
		System.out.println("Insira a idade");
		pessoa2.setIdade(entrada.nextInt());
		
		
		
		System.out.println("Cadastrado com sucesso");
		System.out.println();
		
		
		Pessoa pessoa3 = new Pessoa ();
		
		System.out.println("Insira o nome");
		pessoa3.setNome(entrada.next());
		
		System.out.println("Insira o endereço");
		pessoa3.setEndereco(entrada.next());
		
		System.out.println("Insira a idade");
		pessoa3.setIdade(entrada.nextInt());
		
		
		
		System.out.println("Cadastrado com sucesso");
		System.out.println();
		
		lista.add(pessoa1);
		System.out.println(lista);
		System.out.println();
		
		lista2.add(pessoa2);
		System.out.println(lista2);
		System.out.println();
		
		lista3.add(pessoa3);
		System.out.println(lista3);
		System.out.println();
		
		
		
		try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Saida.txt"))){
			
			//aponta para os objetos de mouse, converte para String e grava no arquivo .txt	
				
					escrever.write();
				
				}
		
	}

	@Override
	public String toString() {
		return "main [toString()=" + super.toString() + "]";
	}
	}
	
