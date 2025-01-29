package videos.oop.house;

public class Runner {
	public static void main(String[] args) {
		Bulb bulb1 = new Bulb("Лампа настольная");
		Bulb bulb2 = new Bulb("Лампочка на потолке");
		Bulb bulb3 = new Bulb("Бра");
		Bulb bulb4 = new Bulb("Канделябра");
		Conditioner conditioner1 = new Conditioner("Вентилятор");
		Conditioner conditioner2 = new Conditioner("Вытяжка");
		TV tv1 = new TV("Маленький ТВ");
		TV tv2 = new TV("Большой ТВ");

		Group kitchen = new Group(bulb1, bulb3, conditioner2, tv1);
		Group livingRoom = new Group(bulb2, bulb4, conditioner1, tv2);
		bulb1.on();
		bulb4.on();
		System.out.println("___________");
		kitchen.groupOn();
		System.out.println("___________");
		livingRoom.groupOn();
		System.out.println("___________");
		conditioner2.off();
		tv1.off();
		System.out.println("___________");
		kitchen.groupCheck();
		livingRoom.groupCheck();
		System.out.println("___________");
	}
}
