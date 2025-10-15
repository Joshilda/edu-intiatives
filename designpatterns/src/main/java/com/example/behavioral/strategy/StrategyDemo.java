package com.example.behavioral.strategy;
public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Book", 500));
        cart.addItem(new Item("Pen", 100));
        cart.pay(new CreditCardPayment("1234567890123456"));
        cart.pay(new PayPalPayment("alice@example.com"));
    }
}
