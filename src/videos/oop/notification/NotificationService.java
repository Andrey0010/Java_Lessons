package videos.oop.notification;

/*Принимает объект Notifier в конструктор.
Возможность работы с несколькими уведомителями одновременно (например, Email и SMS).
Возможность задавать приоритет уведомлений (например, HIGH — отправлять все типы, LOW — только Email).*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class NotificationService {
	private Collection<Notifier> notifier = new ArrayList<>();

	public NotificationService(Notifier ...notifiers) {
		notifier.addAll(Arrays.asList(notifiers));
	}
	private void sendNotifications(String message, String priority) {
		for (Notifier i : notifier) {
			if (priority == null || "High".equalsIgnoreCase(priority)) {
				i.sendNotification(message);
			} else if ("Low".equalsIgnoreCase(priority) && i instanceof EmailNotifier) {
				i.sendNotification(message);
			}
		}
	}
	public void notify(String message) {
		sendNotifications(message, null);
	}
	public void notifyWithPriority(String message, String priority) {
		sendNotifications(message, priority);
	}
	@Override
	public String toString() {
		return "NotificationService{" +
				"notifier=" + notifier +
				'}';
	}
}
