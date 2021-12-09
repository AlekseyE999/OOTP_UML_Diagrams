

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:27
 */
public class Money extends Transaction {

	public int coins;
	public int rubles;

	public Money(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}