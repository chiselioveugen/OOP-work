package lab2.task2;

import java.util.Arrays;
import java.util.Objects;

public class Queue {
    private int size;
    private int maxSize;
    private int list[];

    public Queue() {
        this(10);
    }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
    }

    public boolean push(int value) {
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

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        int value = list[0];
        reallocList(size - 1);
        return value;
    }

    private void reallocList(int newSize) {
        int newList[] = new int[newSize];
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
