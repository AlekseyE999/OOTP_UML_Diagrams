

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:28
 */
public class SoldProduction extends Stockroom {

	public int AmountProducts;
	public int id;
	public int price;
	public Stockroom product;
	public Timestamp purchaseDate;
	public Transaction transaction;
	public User m_User;

	public SoldProduction(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}