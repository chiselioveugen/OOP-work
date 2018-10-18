package lab4.task1;

import java.util.Arrays;
import java.util.Objects;

public class MyStack {
    private int size;
    private int maxSize;
    private char list[];

    public MyStack() {
        this(10);
    }

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
    }

    public boolean push(char value) {
        if (isFull()) {
            return false;
        }
        reallocList(size + 1);
        list[size - 1] = value;
        return true;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public char pop() {
        if (isEmpty()) {
            return 0;
        }
        char value = list[size - 1];
        reallocList(size - 1);
        return value;
    }

    private void reallocList(int newSize) {
        char newList[] = new char[newSize];
        if (!Objects.isNull(list)) {
            int start = size > newSize ? 1 : 0;
            System.arraycopy(list, start, newList, 0, size > newSize ? newSize : size);
        }
        size = newSize;
        list = newList;
    }

    public void showList() {
        if (!Objects.isNull(list)) {
            System.out.println(Arrays.toString(list));
        } else {
            System.out.println("List is null");
        }
    }
}
