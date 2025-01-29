package oopLessons.equals_hashcode.hashcode;

//[ [child1, child2] [child 3, child 4] ]

import oopLessons.equals_hashcode.Child;

public class KinderGarden_groups {
	private Child[][] children;

	public KinderGarden_groups(Child[][] children) {
		this.children = children;
	}

	public Child[][] getChildren() {
		return children;
	}
}
