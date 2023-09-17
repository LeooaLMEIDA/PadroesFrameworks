package ExercicioDecorator;

public class Whatsapp implements Notifier {
    private Notifier notifier;

    public Whatsapp(Notifier notifier) {
        this.notifier = notifier;
    }

    private String whats(String message) {
        return "|WHATSAPP|" + message;
    }

    @Override
    public void notify(String message) {
        String whats = whats(message);
        notifier.notify(whats);
    }
}
