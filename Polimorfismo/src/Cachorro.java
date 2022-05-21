
public class Cachorro extends Animal{
	//subescreve o método falar da classe animal
	@Override
	public void Falar() {
		System.out.println("AU-AU");
}
	//cria o método morder apenas nessa classe pq "teóricamente" só o cachorro morde, kkk
	public void Morder() {
		System.out.println("NHAC");
	}
}