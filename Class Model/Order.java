

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:27
 */
public class Order extends Stockroom {

	private int id;
	public List<Stockroom> production;
	public Status status;

	public Order(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}