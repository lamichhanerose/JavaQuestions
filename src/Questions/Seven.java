package Questions;
//Write a Java program to find the Fibonacci series up to a given number.
public class Seven {

    public static void main(String args[]){

        int a = 1 ;
        int b = 2;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 2 ; i <= 8 ; i++){

            int sum  = a + b;
            a = b ;
            b = sum;
            System.out.print(sum + " ");
        }

    }

}
