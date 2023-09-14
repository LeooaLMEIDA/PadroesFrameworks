package org.example;

public class BitcoinFormaPagamento implements FormaPagamento{

    @Override
    public void pagar(String formaPagamento) {
        System.out.println("Pago com Bitcoin");
    }
}
