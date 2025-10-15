package com.example.behavioral.observer;
import java.util.ArrayList;
import java.util.List;
public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer o) { observers.add(o); }
    @Override
    public void removeObserver(Observer o) { observers.remove(o); }
    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) { o.update(message); }
    }
    public void breakingNews(String news) {
        System.out.println("News Agency: " + news);
        notifyObservers(news);
    }
}
