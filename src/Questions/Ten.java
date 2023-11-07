package Questions;
//Write a Java program to implement a stack data structure.
public class Ten {

    public static final int MAX_SIZE = 5;
    private int top;

    private int[] array;

    public Ten(){
        array = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value){
        System.out.println("top:\t"+ top);
        if (top == MAX_SIZE-1){
            System.out.println("Stack Overflow: Cannot push element, stack is full.");
        }
        else  {
            array[++top] = value;
            System.out.println(value + " pushed to the stack.");
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
        } else {
            System.out.println(array[top--] + " popped from the stack.");
        }
    }

    public static void main(String [] args){
        Ten stack = new Ten();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(20);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

}
