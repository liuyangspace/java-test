package gooduse.obersver;

import javase.data.array.container.collection.list.ArrayList;

public class PersonEvent {
    Object source;

    PersonEvent(Person person){
        this.source = person;
    }

    public Object getSource() {
        return source;
    }
}
