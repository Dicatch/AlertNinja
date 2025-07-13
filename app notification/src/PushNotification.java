public class PushNotification implements Notification {
    private final String title;
    private final String receiverAccount;
    private final String message;

    public PushNotification(String title, String receiverAccount, String message) {
        this.title = title;
        this.receiverAccount = receiverAccount;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    @Override
    public String getFormattedMessage() {
        return "\uD83D\uDC4B " + message;
    }
}
