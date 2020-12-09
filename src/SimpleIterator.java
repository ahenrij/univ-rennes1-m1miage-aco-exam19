public interface SimpleIterator extends Observer {
 
    
    /**
     * throws InvalidIteratorException
     * @return
     */
    public boolean hasNext() throws InvalidIteratorException;

    public String next() throws InvalidIteratorException;
}