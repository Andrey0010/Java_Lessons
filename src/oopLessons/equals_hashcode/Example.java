package oopLessons.equals_hashcode;

public class Example {
	public static void main(String[] args) {
		Child child1 = new Child("Vasya", 2001);
		Child childFind = new Child("Vasya", 2001);
		Child child2 = new Child("Kolya", 2004);
		Child child3 = new Child("Masha", 2003);
		Child child4 = new Child("Petya", 2002);
		Child[] children = {child1, child2, child3, child4};
		KinderGarden kinderGarden = new KinderGarden(children);


		boolean result = false;
		for (Child child : kinderGarden.getChildren()) {
			if (child.equals(childFind)) {
				result = true;
				break;
			}
		}
		System.out.println(result);
	}
}
