package videos.oop.notification;

/*EmailNotifier — отправляет сообщение по электронной почте (выводит Email sent: [message]).*/

public class EmailNotifier implements Notifier{
	@Override
	public void sendNotification(String message) {
		System.out.println("Email-уведомление отправлено. Тескт: " + message);
	}
}
