package videos.oop.notification;

/*SMSNotifier — отправляет сообщение по SMS (выводит SMS sent: [message]).*/

public class SmsNotifier implements Notifier{
	@Override
	public void sendNotification(String message) {
		System.out.println("Cмс-уведомление отправлено. Тескт: " + message);
	}
}
