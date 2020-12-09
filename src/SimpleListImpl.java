import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class SimpleListImpl implements SimpleList {


    private Collection<Observer> observers = new HashSet();
    private Collection<String> internalList = new ArrayList();
    

    public SimpleListImpl() {

    }

    @Override
    public void add(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Parameter non null");
        }

        internalList.add(s);
    }

    @Override
    public void remove(String s) {
        Objects.requireNonNull(s);
        internalList.remove(s);
    }

    @Override
    public SimpleIterator iterator() {
        SimpleIterator iterator = new SimpleIteratorImpl(Collections.unmodifiableCollection(internalList));
        this.register(iterator);
        return iterator;
    }


    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObs() {
        
        for (Observer o: observers) {
            o.update();
        }
    }
}
