package ExercicioDecorator;

import ExercicioDecorator.*;

public class Main {
    public static void main(String[] args) {
        notification(new Email(
                new Sms(
                        new Whatsapp(
                                new Notificacao()
                        )
                )
        ));
    }

    public static void notification (Notifier notifier) {
        notifier.notify("Pedido 1 ");
    }
}