package ExercicioDecorator;

public class Email implements Notifier {
    private Notifier notifier;

    public Email(Notifier notifier) {
        this.notifier = notifier;
    }

    private String mail(String message) {
        return "|EMAIL|" + message;
    }

    @Override
    public void notify(String mensagem) {
        String email = mail(mensagem);
        notifier.notify(email);
    }
}
