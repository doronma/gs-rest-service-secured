package auth;

public class UsersRepository {

	public SimpleUser getUserByName(String name) {
		if (name.equals("doron")) {
			return new SimpleUser("1", "Doron", "password");
		} else {
			return null;
		}
	}

	public UsersRepository() {
		super();
		System.out.println("UserRepository Constructor");
	}

}
