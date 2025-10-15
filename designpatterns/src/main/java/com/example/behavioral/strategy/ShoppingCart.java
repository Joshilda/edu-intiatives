package com.example.behavioral.strategy;
import java.util.ArrayList;
import java.util.List;
class Item {
    String name; int price;
    Item(String name, int price) { this.name = name; this.price = price; }
    int getPrice() { return price; }
}
public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item) { items.add(item); }
    public void pay(PaymentStrategy strategy) {
        int total = items.stream().mapToInt(Item::getPrice).sum();
        strategy.pay(total);
    }
}
