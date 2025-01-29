package start.My_Lessons.equals_hashcode;

/*Сделать так чтобы хешкоды были равны, но equals возвращал false(т.е. объекты не равны)*/

import java.util.Objects;

public class User {
	private String login;
	private double password;

	public User(String login, double password) {
		this.login = login;
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public double getPassword() {
		return password;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o instanceof User user) {
			return this.login.equals(user.login);// && this.password == user.password;
			//return this.login.equals(user.getLogin()) && this.password == user.getPassword();
		}
		return false;
		/*if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Double.compare(password, user.password) == 0 && Objects.equals(login, user.login);*/
	}

	@Override
	public int hashCode() {
		//return Objects.hash(login);
		return this.login.hashCode();
	}
}
