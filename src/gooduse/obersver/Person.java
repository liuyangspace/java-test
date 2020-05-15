package gooduse.obersver;

import javase.data.array.container.collection.list.ArrayList;

public class Person {

    ArrayList<PersonListener> listenerList = new ArrayList<>();

    public void addListener(PersonListener personListener){
        listenerList.add(personListener);
    }

    public void run(){
        System.out.println("Person Run start ...");
        for (PersonListener p : listenerList){
            p.running(new PersonEvent(this));
        }
        System.out.println("Person Run end ...");
    }

}
