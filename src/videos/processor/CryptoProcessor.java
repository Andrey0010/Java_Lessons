package videos.processor;

/*CryptoProcessor — обрабатывает только суммы выше $100 и возвращает результат.*/

public class CryptoProcessor implements PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		if (amount > 100) {
			System.out.println("Платеж на сумму " + amount + " обработан");
			return true;
		}
		return false;
	}
}
