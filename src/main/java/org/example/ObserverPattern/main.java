package org.example.ObserverPattern;

public class main {
    public static void main(String[] args) {
        JoueurObservablesImpl observable=new JoueurObservablesImpl();
        Observers ob1=new CameraObserversImpl();
        Observers ob2=new CouloirObserversImpl();
        Observers ob3=new CameraObserversImpl();
        observable.subscribe(ob1);
        observable.subscribe(ob2);
        observable.subscribe(ob3);

        observable.setScore(10);
        observable.setScore(22);
        observable.setScore(50);

        //observable.notify();
    }
}
