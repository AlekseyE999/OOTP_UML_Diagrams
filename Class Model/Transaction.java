

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:28
 */
public class Transaction extends SoldProduction {

	public Timeatamp dateTime;
	public int id;
	public int moneyAmount;

	public Transaction(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}