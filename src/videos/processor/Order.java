package videos.processor;

/*Создайте класс Order, который: Содержит amount (сумма заказа) и PaymentProcessor.
Имеет метод completePayment(), который вызывает processPayment() через PaymentProcessor.
Создайте несколько заказов с разными способами оплаты.
Используйте инверсию зависимостей, чтобы сменить процессор оплаты без изменения логики класса Order.*/

public class Order {
	double amount;
	PaymentProcessor processor;

	public Order(double amount, PaymentProcessor processor) {
		this.amount = amount;
		this.processor = processor;
	}
	public void completePayment(double amount) {
		if (processor.processPayment(amount)) {
			System.out.println("Оплата проведена");
		}else {
			System.out.println("Ошибка оплаты");
		}
	}

	@Override
	public String toString() {
		return "Order{" +
				"amount=" + amount +
				", processor=" + processor +
				'}';
	}
}
