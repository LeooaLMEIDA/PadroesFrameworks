public class Main {
    public static void main(String[] args) {
        GmailClient gmailClient = new GmailClient();
        EmailProvider gmailAdapater = new GmailClientAdapter(gmailClient);

        EmailClient emailClient = new EmailClient(gmailAdapater);
        emailClient.ConectarEmail();
    }
}