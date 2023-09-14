package org.example;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        pagamento.pagarDelivery("Cartão Crédito", new CartaoCreditoFormaPagamento());
        pagamento.pagarDelivery("Bitcoin", new BitcoinFormaPagamento());
        pagamento.pagarDelivery("PayPal", new PaypalFormaPagamento());
        pagamento.pagarDelivery("Dinheiro", new DinheiroFormaPagamento());
    }
}