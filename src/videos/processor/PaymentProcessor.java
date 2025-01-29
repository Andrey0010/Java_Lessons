package videos.processor;
/*Моделирование системы платежей
Создайте интерфейс PaymentProcessor с методом:
boolean processPayment(double amount).

Реализуйте три класса, представляющие различные способы оплаты:
CreditCardProcessor — обрабатывает платеж, если сумма меньше лимита в $5000.
Лимит задаётся через конструктор.
Если сумма превышает лимит, метод возвращает false.

PayPalProcessor — добавляет комиссию 2% к сумме платежа и возвращает результат.

CryptoProcessor — обрабатывает только суммы выше $100 и возвращает результат.

Создайте класс Order, который: Содержит amount (сумма заказа) и PaymentProcessor.
Имеет метод completePayment(), который вызывает processPayment() через PaymentProcessor.

Задача:
Создайте несколько заказов с разными способами оплаты.
Используйте инверсию зависимостей, чтобы сменить процессор оплаты без изменения логики класса Order.*/

public interface PaymentProcessor {
	boolean processPayment(double amount);
}
