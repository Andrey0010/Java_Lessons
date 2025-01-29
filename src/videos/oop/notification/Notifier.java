package videos.oop.notification;
/*Система уведомлений
Создайте интерфейс Notifier с методом:
void sendNotification(String message).

Реализуйте три класса:
EmailNotifier — отправляет сообщение по электронной почте (выводит Email sent: [message]).
SMSNotifier — отправляет сообщение по SMS (выводит SMS sent: [message]).
PushNotifier — отправляет push-уведомление (выводит Push notification sent: [message]).

Создайте класс NotificationService, который:
Принимает объект Notifier в конструктор.
Добавьте в NotificationService возможность работы с несколькими уведомителями одновременно (например, Email и SMS).
Добавьте возможность задавать приоритет уведомлений (например, HIGH — отправлять все типы, LOW — только Email).

Используйте инверсию зависимостей для смены типа уведомлений.
Цель: Продемонстрировать гибкость интерфейсов и работу с множественными зависимостями.*/
public interface Notifier {
	void sendNotification(String message);
}
