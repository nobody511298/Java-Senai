
public class Cachorro extends Animal{
	//subescreve o m�todo falar da classe animal
	@Override
	public void Falar() {
		System.out.println("AU-AU");
}
	//cria o m�todo morder apenas nessa classe pq "te�ricamente" s� o cachorro morde, kkk
	public void Morder() {
		System.out.println("NHAC");
	}
}