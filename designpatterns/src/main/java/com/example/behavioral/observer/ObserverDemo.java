package com.example.behavioral.observer;
public class ObserverDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");
        agency.registerObserver(s1);
        agency.registerObserver(s2);
        agency.breakingNews("New Java Version Released!");
        agency.breakingNews("Stock Market Hits Record High!");
    }
}
