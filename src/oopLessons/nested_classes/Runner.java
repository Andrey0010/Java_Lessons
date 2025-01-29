package oopLessons.nested_classes;

public class Runner {
	public static void main(String[] args) {
		Human human = new Human("34jhj", "23234", PassportType.FOREIGN);
		//Human.Passport passport = new Human.Passport("34jhj", "23234", PassportType.FOREIGN);
		//human.setPassport(passport);
		System.out.println(human);
		//Human.Heart heart = human.new Heart(280);

	}
}
