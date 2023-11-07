package Questions;

//Write a Java program to implement a queue data structure.
public class Eleven {
    private static final int MAX_SIZE = 5;
    private int front, rear, size;
    private int[] array;

    public Eleven() {
        array = new int[MAX_SIZE];
        front = rear = 0;
        size = 0;
    }

    public void insert(int value) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue Overflow: Queue is full.");
        } else {
            if (front == -1) {
                front = 0;
            }
            array[++rear] = value;
            size++;
            System.out.println(value + " inserted to the queue.");
        }
    }


    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow: Cannot delete element, queue is empty.");
        } else {
            System.out.println(array[front] + " deleted from the queue.");
            front++;
            size--;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }


    public static void main(String args[]){
        Eleven queue = new Eleven();

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(30);
        queue.insert(30);
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();


    }

}

