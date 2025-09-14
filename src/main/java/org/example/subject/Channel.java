package org.example.subject;

import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private final String name;
    private final List<Observer> subscribers = new ArrayList<>();


    public Channel(String name) {
        this.name = name;
    }

    public void uploadVideo(String title){
        // TODO: Notify all subscribers about new video
        notifyObservers(" new video uploaded " + title);

    }

    @Override
    public void subscribe(Observer observer) {
        // TODO: Add subscriber
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        // TODO: Remove subscriber
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        // TODO: Notify subscribers
        for ( Observer observer : subscribers) {
            observer.update("[" + name +"]" + message);

        }
    }

    public String getName() {
        return name;
    }
}
