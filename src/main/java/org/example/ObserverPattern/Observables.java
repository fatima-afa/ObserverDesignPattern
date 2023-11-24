package org.example.ObserverPattern;

public interface Observables {
    void subscribe(Observers observer);
    void unsubscribe(Observers observer);
    //void notify();
    void notif();

}
