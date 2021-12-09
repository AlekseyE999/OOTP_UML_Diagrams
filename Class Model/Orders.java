

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:27
 */
public class Orders extends Order {

	private int id;
	public List<Order> production;
	public User m_User;

	public Orders(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}