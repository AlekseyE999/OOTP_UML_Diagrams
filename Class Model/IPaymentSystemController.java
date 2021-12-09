

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:27
 */
public interface IPaymentSystemController {

	public ManagerController m_ManagerController;
	public AuthorizedUserController  m_AuthorizedUserController ;
	public DirectorController  m_DirectorController ;

	/**
	 * 
	 * @param transaction
	 */
	public void GetTransactionStatus(Transaction transaction);

	public List<Transaction> PerformTransactions();

	/**
	 * 
	 * @param transaction
	 */
	public boolean ProcessTransaction(Transaction transaction);

}