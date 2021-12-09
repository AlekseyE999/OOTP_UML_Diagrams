

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:26
 */
public class CatalogEntry extends Stockroom {

	public int id;
	public Money price;
	public Stockroom production;
	public Timestamp timeAddedToCatalog;

	public CatalogEntry(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}