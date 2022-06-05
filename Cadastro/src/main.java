import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// insere scanner
		Scanner entrada = new Scanner(System.in);

		// cria nova lista
		List<Pessoa> listaPessoaEscrever = new ArrayList<Pessoa>();

		// coloca sistema *for*

		for (int x = 0; x < 4; x++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());

		 	System.out.println("Insira o nome");
			pessoa.setNome(entrada.next());

			System.out.println("Insira 1 para Feminino e 2 para Masculino");
			int opcao = 0;
			while (opcao != 1 && opcao != 2) {
				opcao = entrada.nextInt();
				if (opcao == 2)
					pessoa.setSex(Sexo.MASCULINO);
				else if (opcao == 1)
					pessoa.setSex(Sexo.FEMININO);
				else {
					System.out.println("Opção inválida");
					System.out.println("Tente novamente");
					System.out.println("Insira 1 para Feminino e 2 para Masculino");
				}
			}

			System.out.println("Insira a rua");
			pessoa.getEndereco().setRua(entrada.next());

			System.out.println("Insira o numero");
			pessoa.getEndereco().setNumero(entrada.nextInt());

			System.out.println("Insira o bairro");
			pessoa.getEndereco().setBairro(entrada.next());

			System.out.println("Insira a idade");
			pessoa.setIdade(entrada.nextInt());

			System.out.println("Cadastrado com sucesso");

			// adiciona pessoa na lista
			listaPessoaEscrever.add(pessoa);

		}
		

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Cadastro.txt"))) {
			// aponta para os objetos de mouse, converte para String e grava no arquivo .txt
			escrever.write(listaPessoaEscrever.toString());

		}
		

		List<Pessoa> listaPessoaLer = new ArrayList<Pessoa>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("Saida.txt"))){
			String line;			
			while((line = reader.readLine())!=null) {
			
				Pessoa pessoa = new Pessoa(line);
				
				listaPessoaLer.add(pessoa);
				
			}
		}
		
		
		for(Pessoa pessoa: listaPessoaLer) {
			System.out.println(pessoa);
		}
	}
}
