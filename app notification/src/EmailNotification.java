import java.util.List;

public class EmailNotification implements Notification {
    private final String subject;
    private final List<String> receivers;
    private final String message;

    public EmailNotification(String subject, List<String> receivers, String message) {
        this.subject = subject;
        this.receivers = receivers;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getReceivers() {
        return receivers;
    }

    @Override
    public String getFormattedMessage() {
        return "<p>" + message + "</p>";
    }
}
