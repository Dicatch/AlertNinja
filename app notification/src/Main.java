import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Email notifications
        EmailNotification email1 = new EmailNotification("Добро пожаловать!", List.of("anna@example.com"), "Спасибо за регистрацию на сервисе!");
        EmailNotification email2 = new EmailNotification("Напоминание", List.of("ivan@java.com", "katya@java.com"), "Не забудьте подтвердить почту.");
        EmailNotification email3 = new EmailNotification("Активация", List.of("masha@skillbox.ru"), "Ваш аккаунт активирован!");

        EmailNotificationSender emailSender = new EmailNotificationSender();
        emailSender.send(List.of(email1, email2, email3));

        // SMS notifications
        SmsNotification sms1 = new SmsNotification(List.of("+1234567890"), "Спасибо за регистрацию на сервисе!");
        SmsNotification sms2 = new SmsNotification(List.of("+70000000001", "+70000000002"), "Ваш код подтверждения: 1234");
        SmsNotification sms3 = new SmsNotification(List.of("+70000000003"), "Аккаунт успешно создан!");

        SmsNotificationSender smsSender = new SmsNotificationSender();
        smsSender.send(List.of(sms1, sms2, sms3));

        // Push notifications
        PushNotification push1 = new PushNotification("Регистрация", "a.petrov", "Спасибо за регистрацию на сервисе!");
        PushNotification push2 = new PushNotification("Добро пожаловать", "m.serova", "У вас новое сообщение.");
        PushNotification push3 = new PushNotification("Безопасность", "v.nikitin", "Ваш пароль был изменён.");

        PushNotificationSender pushSender = new PushNotificationSender();
        pushSender.send(List.of(push1, push2, push3));
    }
}
