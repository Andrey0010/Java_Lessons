package videos.oop.notification;

public class Main {
	public static void main(String[] args) {
		SmsNotifier smsNotifier = new SmsNotifier();
		PushNotifier pushNotifier = new PushNotifier();
		EmailNotifier emailNotifier = new EmailNotifier();

		NotificationService smsService = new NotificationService(smsNotifier);
		NotificationService smsPushService = new NotificationService(smsNotifier, pushNotifier);
		NotificationService multiService = new NotificationService(smsNotifier, pushNotifier, emailNotifier);

		smsService.notify("Внестие абонентскую плату");
		System.out.println("________");
		smsPushService.notify("Внестие абонентскую плату");
		System.out.println("________");
		multiService.notify("Внестие абонентскую плату");
		System.out.println("________");
		multiService.notifyWithPriority("С Новым Годом", "low");
		System.out.println("________");
		multiService.notifyWithPriority("Оплатите задолженность", "high");

	}
}
