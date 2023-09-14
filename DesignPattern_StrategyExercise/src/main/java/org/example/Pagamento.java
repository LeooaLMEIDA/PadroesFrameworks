package org.example;

public class Pagamento {
    public void pagarDelivery(String formaPagamento, FormaPagamento fp){
        fp.pagar(formaPagamento);
    }
}
