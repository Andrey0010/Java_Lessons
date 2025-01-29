package oopLessons.equals_hashcode.hashcode;

import oopLessons.equals_hashcode.Child;

public class HashcodeExample {
	public static void main(String[] args) {
		Child child1 = new Child("Vasya", 2001);
		Child child2 = new Child("Kolya", 2002);
		Child child3 = new Child("Masha", 2002);
		Child child4 = new Child("Petya", 2001);

		Child childFind = new Child("Vasya", 2001);

		Child[] group0 = {child3, child2};
		Child[] group1 = {child1, child4};
		Child[][] group3 = {group0, group1};

		KinderGarden_groups kinderGardenGroups = new KinderGarden_groups(group3);

		/*for (Child[] group : kinderGardenGroups.getChildren()) {
			for (Child child : group) {
				if (child.equals(childFind)) {
					System.out.println(child);
				}
			}
		}*/
		boolean result = false;
		for (Child child : kinderGardenGroups.getChildren()[childFind.hashCode()]) {   //[0]
			if (child.equals(childFind)) {
				result = true;
				break;
			}
		}
		System.out.println(result);


		//System.out.println(child1.hashCode());

	}
}
