package videos.bankAccount;

import java.math.BigDecimal;

public class Runner {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(765765, BigDecimal.valueOf(3000));
		BankAccount account2 = new BankAccount(678456, BigDecimal.valueOf(3000));

		account1.addMoney(BigDecimal.valueOf(1000));
		System.out.println(account1);
		account2.takeMoney(BigDecimal.valueOf(300));
		System.out.println(account2);
		account1.transfer(BigDecimal.valueOf(500), account2);
		System.out.println(account1);
		System.out.println(account2);
		account1.transferPercent(BigDecimal.valueOf(5), account2);
		System.out.println(account1);
		System.out.println(account2);

	}
}
