import java.util.Collection;
import java.util.Iterator;

public class SimpleIteratorImpl implements SimpleIterator {
    
    private boolean isValid = true;
    private Iterator<String> iterator;

    public SimpleIteratorImpl(Collection<String> list) {
        this.iterator = list.iterator();
    }

    @Override
    public void update() {
        isValid = false;
    }

    @Override
    public boolean hasNext() throws InvalidIteratorException {
        if (!isValid) {
            throw new InvalidIteratorException("L'iterateur est invalide");
        }
        return iterator.hasNext();
    }

    @Override
    public String next() throws InvalidIteratorException {
        
        if (!isValid) {
            throw new InvalidIteratorException("L'iterateur est invalide");
        }
        return iterator.next();
    }
}
