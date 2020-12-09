
/**
 * Manages a simple string list
 * 
 * @author us
 * @since today
 */

public interface SimpleList extends Observable {   
    
    /**
     * Add a string element to list
     * @param s, non-null element to add to the list
     * @throws IllegalArgumentException if s is null
     */
    public void add(String s);

    /**
     * Remove s from the list
     * 
     * @param s, non-null string to remove from list
     * @throws IllegalArgumentException if s is null or if list doesn't contain s
     */
    public void remove(String s);

    /**
     * Provides iterator on this SimpleList
     * @return SimpleIterator on this list
     */
    public SimpleIterator iterator();
}
