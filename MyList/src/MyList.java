public interface MyList<E> extends java.lang.Iterable<E> {
    public void add(E e);
    public void add(int index, E e);
    public void clear();
    public boolean contains(E e);
    public E get(int index);
    /**
     * return ilk eşleşen element
     * yoksa -1
     * */
    public int indexOf(E e);
    public boolean isEmpty();
    public int lastIndexOf(E e);
    /**
     * remove ilk eşleşen
     * sola kayrdırır remove dan sonra
     * return true
     * */
    public boolean remove(E e);
    /**
     * return removed element
     * and shift left
     * */
    public E remove(int index);
    //return old element
    public Object set(int index, E e);
    public int size();
}
