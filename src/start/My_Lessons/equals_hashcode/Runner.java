package start.My_Lessons.equals_hashcode;

/*Сделать так чтобы хешкоды были равны, но equals возвращал false(т.е. объекты не равны)*/

public class Runner {
	public static void main(String[] args) {
		User user1 = new User("Vasya", 1111111);
		User user2 = new User("Vasya", 2222222);

		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());

		boolean check = false;
		if (user1.equals(user2))
			check = true;
		System.out.println(check);

		System.out.println(user1.equals(user2));
	}
}
