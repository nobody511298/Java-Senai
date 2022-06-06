
public class Aplicacao {

	public static void main(String[] args) {
	
		Data d1 = new Data(10, 03, 2000, 0, 30, 10);//da valores e estacia nova data 
		d1.imprimir(Data.FORMATO_12H);//chama o método imprimir de data ( formato 12h)
		d1.imprimir(Data.FORMATO_24H);//chama o método imprimir de data ( formato 24h)

		//estancia mais duas datas e faz a mesma coisa dos comentários de cima
		Data d2 = new Data(15, 06, 2000, 23, 15, 20);
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);
	
		Data d3 = new Data(5, 10, 2005);
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);
	}
}
