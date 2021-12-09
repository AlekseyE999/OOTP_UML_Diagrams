

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:27
 */
public class ManagerController implements IController {

	private IDBController BDController;
	private IPaymentSystemController paymentSystemController;
	public DispetcherServlet m_DispetcherServlet;

	public ManagerController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param product
	 */
	private void AddToCatalog(AssesoriesIntel product){

	}

	/**
	 * 
	 * @param product
	 */
	private void AddToStockRoom(AssesoriesIntel product){

	}

	/**
	 * 
	 * @param id
	 */
	private void ConfirmOrder(Orders id){

	}

	private void EditCatalog(){

	}

	/**
	 * 
	 * @param product
	 */
	private void EditProduct(AssesoriesIntel product){

	}

	private boolean LogOut(){
		return false;
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
	 * @param product
	 */
	private void RemoveFromCatalog(AssesoriesIntel product){

	}

	private Catalog ViewCatalog(){
		return null;
	}

	private List<Orders> ViewOrders(){
		return null;
	}

	private List<Stockroom> ViewStockRoom(){
		return null;
	}

}