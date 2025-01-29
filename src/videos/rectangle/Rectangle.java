package videos.rectangle;
/*
Задача : Класс Rectangle
Поля:
width (ширина, тип double),
height (высота, тип double).

Реализуйте методы:
Конструктор для инициализации полей width и height.
Метод area(): возвращает площадь прямоугольника.
Метод perimeter(): возвращает периметр прямоугольника.
Метод scale(double factor): увеличивает ширину и высоту на заданный коэффициент.
Перегруженный метод scale(double widthFactor, double heightFactor):
масштабирует отдельно ширину и высоту.
*/
public class Rectangle {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return width * 2 + height * 2;
	}
	public void scale(double factor) {
		width += factor;
		height += factor;
	}
	public void scale(double widthFactor, double heightFactor) {
		width += widthFactor;
		height += heightFactor;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"width=" + width +
				", height=" + height +
				'}';
	}
}
