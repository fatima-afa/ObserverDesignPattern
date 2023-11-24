package org.example.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class JoueurObservablesImpl implements Observables {
    private int score=0;
    public List<Observers> observers=new ArrayList<>();
    @Override
    public void subscribe(Observers observer) {
       this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observers observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notif() {
        for(Observers o:observers)
            o.update(this);
    }


    public void setScore(int s){
        this.score=s;
        this.notif();
    }
    public int getScore(){
        return this.score;
    }
}
