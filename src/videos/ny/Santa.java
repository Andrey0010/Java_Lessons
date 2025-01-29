package videos.ny;

import java.util.Random;
import java.util.Scanner;

public class Santa {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			// Начальное количество подарков в мешке (от 20 до 50)
			int giftsInBag = 30; // Можете задать любое число
			System.out.println("Мешок Санты содержит " + giftsInBag + " подарков.");

			do {
				System.out.print("Сколько подарков достать из мешка? ");
				int giftsTaken = scanner.nextInt();

				// Проверяем, чтобы количество подарков не превышало оставшееся в мешке
				if (giftsTaken > giftsInBag) {
					System.out.println("Вы не можете достать больше подарков, чем есть в мешке!");
					continue; // Пропускаем текущую итерацию, просим ввести число заново
				}

				// Уменьшаем количество подарков в мешке
				giftsInBag -= giftsTaken;

				System.out.println("Санта достал " + giftsTaken + " подарков, осталось " + giftsInBag + ".");
			} while (giftsInBag > 0);

			System.out.println("Мешок пуст, подарки закончились!");
		}
}
