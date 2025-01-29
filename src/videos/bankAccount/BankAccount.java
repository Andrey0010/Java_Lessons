package videos.bankAccount;

/* Задача: Управление счетами клиентов банка
Создайте класс, который представляет банковский счет. Каждый объект счета должен иметь:
Уникальный идентификатор клиента.
Баланс счета.
Способ проверки текущего баланса.
Метод для получения инфо о счете(id и баланс)
Возможность пополнения и снятия средств.

Добавьте возможность управления несколькими счетами:
Реализуйте метод для перевода денег с одного счета на другой.
Реализуйте перегрузку метода перевода для случаев,
когда указывается либо сумма перевода, либо процент от текущего баланса.
Метод для получения общего кол-ва созданных счетов.
*/

import java.math.BigDecimal;

public class BankAccount {
	private long id;
	private BigDecimal balance;
	private static int accountsNumber;

	public BankAccount(long id, BigDecimal balance) {
		this.id = id;
		this.balance = balance;
		accountsNumber++;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public long getId() {
		return id;
	}
	public void info(){
		System.out.println("Информация о текущем счете: ");
		System.out.println("Номер счета: " + getId());
		System.out.println("Баланс: " + getBalance());
	}
	public static int getAccountsNumber() {
		return accountsNumber;
	}
	public void addMoney(BigDecimal sum) {
		balance = balance.add(sum);
	}
	public void takeMoney(BigDecimal sum) {
		if (sum.compareTo(balance) > 0) {
			System.out.println("Запрашиваеммая сумма превышает текущий баланс");
		}else {
			balance = balance.subtract(sum);
		}
	}
	public void transfer(BigDecimal sum, BankAccount account) {
		if (sum.compareTo(balance) > 0) {
			System.out.println("Запрашиваеммая сумма превышает текущий баланс");
		}else {
			balance = balance.subtract(sum);
			//account.balance += sum;
			account.addMoney(sum);
		}
	}
	public void transferPercent(BigDecimal percent, BankAccount account) {
		BigDecimal sum = balance.multiply(percent).divide(BigDecimal.valueOf(100));
		transfer(sum, account);
	}

	@Override
	public String toString() {
		return "BankAccount{" +
				"id=" + id +
				", balance=" + balance +
				'}';
	}
}

