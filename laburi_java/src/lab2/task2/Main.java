package lab2.task2;

public class Main {
    public static void main(String[] argx) {
        Queue q = new Queue(4);
        q.showList();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.push(1);
        q.push(5);
        q.showList();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.push(10);
        q.push(7);
        q.showList();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(15);
        q.showList();
        System.out.println(q.pop());
    }
}
