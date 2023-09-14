package org.example;

public class DinheiroFormaPagamento implements FormaPagamento{

    @Override
    public void pagar(String formaPagamento) {
        System.out.println("Pago com Dinheiro");
    }
}
