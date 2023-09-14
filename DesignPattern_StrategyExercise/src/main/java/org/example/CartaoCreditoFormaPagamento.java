package org.example;

public class CartaoCreditoFormaPagamento implements FormaPagamento{

    @Override
    public void pagar(String formaPagamento) {
        System.out.println("Pago com Cartão de Crédito");
    }
}
