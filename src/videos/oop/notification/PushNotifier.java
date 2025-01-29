package videos.oop.notification;

/*PushNotifier — отправляет push-уведомление (выводит Push notification sent: [message]).*/

public class PushNotifier implements Notifier{
	@Override
	public void sendNotification(String message) {
		System.out.println("Пуш-уведомление отправлено. Тескт: " + message);
	}
}
