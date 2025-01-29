package oopLessons.record;

public class Record_example {
	public static void main(String[] args) {
		Human human = new Human(1992, "Ivan", "Ivanov", "Ivanovich");
		System.out.println(human);
		HumanRecord humanRecord = new HumanRecord(1992, "Ivan", "Ivanov", "Ivanovich");
		System.out.println(humanRecord);
		humanRecord.info();
	}
}
