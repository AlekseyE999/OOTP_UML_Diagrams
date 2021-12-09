

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:26
 */
public class AuthorizedUserController  implements IController {

	private IDBController BDController;
	private User currentUser;
	private IPaymentSystemController paymentSystemController;
	public DispetcherServlet m_DispetcherServlet;

	public AuthorizedUserController (){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param product
	 */
	private void AddToBasket(AssesoriesIntel product){

	}

	private void Buy(){

	}

	/**
	 * 
	 * @param id
	 */
	private void DeleteFromBusket(AssesoriesIntel id){

	}

	/**
	 * 
	 * @param model
	 * @param name
	 * @param price
	 * @param type
	 */
	private List<Product> Filter(String model, String name, Money price, String type){
		return null;
	}

	private boolean LogOut(){
		return false;
	}

	private Basket OpenBusket(){
		return null;
	}

	/**
	 * 
	 * @param request
	 * @param response
	 */
	public void ProcessRequest(HttpServletRequest request, HttpServletResponse response){

	}

	/**
	 * 
	 * @param id
	 */
	private void RemoveFromBasket(AssesoriesIntel id){

	}

	/**
	 * 
	 * @param count
	 * @param productId
	 */
	private void SetCount(int count, int productId){

	}

	private void ViewCatalog(){

	}

	/**
	 * 
	 * @param id
	 */
	private AssesoriesIntel ViewProduct(AssesoriesIntel id){
		return null;
	}

}