package videos.processor;

/*CreditCardProcessor — обрабатывает платеж, если сумма меньше лимита в $5000.
Лимит задаётся через конструктор.
Если сумма превышает лимит, метод возвращает false.*/

public class CreditCardProcessor implements PaymentProcessor {
	private double limit;

	public CreditCardProcessor(double limit) {
		this.limit = limit;
	}

	@Override
	public boolean processPayment(double amount) {
		if (amount < limit) {
			System.out.println("Платеж " + amount + " обработан кредитной картой");
			return true;
		}
		System.out.println("Сумма платежа " + amount + " превышает " + limit);
		return false;
	}
}
