

/**
 * @author Алексей
 * @version 1.0
 * @created 03-дек.-2021 18:02:29
 */
public class User {

	public Basket backet;
	public String email;
	public int id;
	public boolean isActive;
	public String login;
	public String passwordHash;
	public Role role;

	public User(){

	}

	public void finalize() throws Throwable {

	}

}