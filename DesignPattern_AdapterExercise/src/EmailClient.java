public class EmailClient {
    private EmailProvider emailProvider;

    public EmailClient(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }

    public void ConectarEmail() {
        emailProvider.conectar();
    }

}
