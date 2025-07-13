import java.util.List;

public class SmsNotification implements Notification {
    private final List<String> phoneNumbers;
    private final String message;

    public SmsNotification(List<String> phoneNumbers, String message) {
        this.phoneNumbers = phoneNumbers;
        this.message = message;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String getFormattedMessage() {
        return message;
    }
}
