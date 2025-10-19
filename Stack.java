import java.util.Arrays;
import java.util.EmptyStackException;
public class SimpleStack<T> {
    private static final int DEFAULT_SIZE = 3;
    private int size;
    private T[] items;
    public SimpleStack() {
        this.items = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }
    public SimpleStack(int capacity) {
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }
    public void addItem(T item) {
        if (size == items.length)
            doubleStack();
        items[size++] = item;
    }
    public T removeItem() {
        if (isstckEmpty())
            throw new EmptyStackException();
        T topItem = items[--size];
        items[size] = null;
        return topItem;
    }
    public T topItem() {
        if (isstckEmpty())
            throw new EmptyStackException();
        return items[size - 1];
    }
    public boolean isstckEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public void showStack() {
        if (isstckEmpty()) {
            throw new EmptyStackException();
        }
        System.out.println("Items in the stack:");
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]+" ");
        }
        System.out.println();
    }
    private void doubleStack() {
        items = Arrays.copyOf(items, items.length*2);
}
}
