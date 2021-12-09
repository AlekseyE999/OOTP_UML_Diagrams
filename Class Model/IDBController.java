

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:26
 */
public interface IDBController {

	public ManagerController m_ManagerController;
	public UnauthorizedUserController  m_UnauthorizedUserController ;
	public DeliveryServiceController  m_DeliveryServiceController ;
	public AuthorizedUserController  m_AuthorizedUserController ;
	public DirectorController  m_DirectorController ;

	/**
	 * 
	 * @param object
	 */
	public void Add(object object);

	/**
	 * 
	 * @param object
	 */
	public void Delete(object object);

	/**
	 * 
	 * @param id
	 */
	public void DeleteById(int id);

	public List<object> Get();

	/**
	 * 
	 * @param id
	 */
	public object GetById(int id);

	public void SetConnection();

	/**
	 * 
	 * @param object
	 */
	public void Update(object object);

}