import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.List;




public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			
			Mecanico mecanico1 = new Mecanico("Cleber", 237846, 60.00);
			Mecanico mecanico2 = new Mecanico("Joao",656846, 80.00);
			Servico servico = new Servico("Serviço_1",2.5,90.00,mecanico1);
			Servico servico2 = new Servico("Serviço_2",2.5,60.00,mecanico2);
		
			// cria nova lista
			List<Cliente> listaClienteEscrever = new ArrayList<Cliente>();
			
			
			Cliente cliente1 = new Cliente ("José", 54321, 12.66, servico, FormaPag.A_VISTA);
			Cliente cliente2 = new Cliente ("Gabriel", 12345, 22.67, servico, FormaPag.CARNE);
			Cliente cliente3 = new Cliente ("Wellington", 7890, 34.66, servico2, FormaPag.A_VISTA);
			Cliente cliente4 = new Cliente ("Antonio", 9876, 22.66, servico2, FormaPag.CARTAO_CREDITO);
			
			listaClienteEscrever.add(cliente1);
			listaClienteEscrever.add(cliente2);
			listaClienteEscrever.add(cliente3);
			listaClienteEscrever.add(cliente4);
			
			for (Cliente cliente: listaClienteEscrever) {
				System.out.println("O cliente " + cliente.getNome() + ", CPF: "+ cliente.getCpf()+ " Escolheu o serviço " + cliente.getServico().getNome() + " Que será realizado pelo mecânico " + cliente.getServico().getMecanico().getNome() + " E o valor bruto sera de " + (cliente.getValorPagarServico() + cliente.getServico().getMecanico().getMaoDeObra()) );
				
			}
			
			
			
			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Cadastro.txt"))) {
				// aponta para os objetos de mouse, converte para String e grava no arquivo .txt
				
				escrever.write(listaClienteEscrever.toString());

			}
			
		
	}
	}
	

