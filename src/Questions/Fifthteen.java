package Questions;

import java.util.Arrays;

//Write a Java program to sort an array of strings in alphabetical orders.
public class Fifthteen {

    public static void main(String args[]) {

        String[] stringArray = {"Apple", "Orange", "Banana", "Grapes", "Cherry", "Watermelon"};

        Arrays.sort(stringArray);

        System.out.print("Sorted Array: ");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }

}


