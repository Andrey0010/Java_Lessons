package coursera.string_dna;
/*Напишите метод с именем lastPart, который имеет два параметра String с именами stringa и stringb.
Этот метод находит первое вхождение stringa в stringb и возвращает ту часть stringb, которая следует за stringa.
Если строка stringa не встречается в строке stringb, то возвращается строка stringb.
Например, вызов lastPart("an", "banana") возвращает строку "ana", часть строки после первого "an".
Вызов lastPart("zoo", "forest") возвращает строку "forest", поскольку "zoo" не встречается в этом слове.*/
public class Task_006 {
	public String newPart(String stringa, String stringb) {
		int indexFirst = stringb.indexOf(stringa);
		if (indexFirst != -1) {
			return stringb.substring(indexFirst + stringa.length());
		}return stringb;
	}
	public void test() {
		System.out.println(newPart("asd", "fffffffasdddddd"));
		System.out.println(newPart("asd", "fffffffddddd"));
		System.out.println(newPart("asd", "fffffffasd"));
	}

	public static void main(String[] args) {
		Task_006 task006 = new Task_006();
		task006.test();
	}
}
