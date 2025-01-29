package videos.processor;

/*PayPalProcessor — добавляет комиссию 2% к сумме платежа и возвращает результат.*/

public class PayPalProcessor implements PaymentProcessor {
	private static final double COMMISSION = 0.02;

	@Override
	public boolean processPayment(double amount) {
		double totalAmount = amount + amount * COMMISSION;
		System.out.println("Платеж " + amount + " обработан PayPal");
		return true;
	}
}
