# AlertNinja

**AlertNinja** — это Java-приложение, имитирующее отправку уведомлений по разным каналам:  
📧 Email,  
📱 SMS,  
🔔 Push.

## 📌 Особенности

- Email-уведомления содержат тему, список адресов и форматируются как HTML (`<p>...</p>`)
- SMS-сообщения — обычный текст без форматирования
- Push-уведомления — содержат заголовок и эмодзи 👋 перед текстом

## 📂 Структура

- `Notification` — интерфейс уведомления
- `NotificationSender<T>` — универсальный интерфейс отправщика
- Классы `EmailNotification`, `SmsNotification`, `PushNotification`
- Отправщики `EmailNotificationSender`, `SmsNotificationSender`, `PushNotificationSender`
- `Main.java` — демонстрация работы

## 🚀 Запуск

```bash
javac Main.java
java Main