import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formulas temp = new Formulas();
		Formulas opt = new Formulas();
		Formulas form = new Formulas();
		
		Ra ra = new Ra();
		F f =  new F();
		K k = new K();
		Re re = new Re();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em graus C°");
		temp.setTemp(entrada.nextDouble());
		System.out.println("Agora digite a unidade de conversão:");
		System.out.println("1 para Kelvin; 2 para Farenheit; 3 para Réaumur e 4 para Rankine");
		opt.setOpt(entrada.nextInt());
		
		int opc = opt.getOpt();
		double tempe = temp.getTemp();
		System.out.println(opc);
		
		switch (opt.getOpt()) {
		
			case 3:
				re.calcularT();
				break;
			case 4:
				ra.calcularT();
				break;
			case 1:
				k.calcularT();
				break;
			case 2:
				f.calcularT();
				break;
			default:
				System.out.println("Não funcionou");
				break;
			}
	}
}
		

	
	

