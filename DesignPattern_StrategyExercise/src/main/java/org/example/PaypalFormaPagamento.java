package org.example;

public class PaypalFormaPagamento implements FormaPagamento{

    @Override
    public void pagar(String formaPagamento) {
        System.out.println("Pago com PayPal");
    }
}
