public class GmailClientAdapter implements EmailProvider{

    private GmailClient gmailClient;
    public GmailClientAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void conectar() {
        gmailClient.conectarGmail();
    }
}
