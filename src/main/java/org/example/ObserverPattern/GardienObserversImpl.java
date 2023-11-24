package org.example.ObserverPattern;

public class GardienObserversImpl implements Observers {
    @Override
    public void update(Observables observable) {
        System.out.println("--------------hello from Gardien---------------");
        int score = ((JoueurObservablesImpl)observable).getScore();
        System.out.println("the score is : "+score);
        System.out.println("======================bye======================");
    }
}
