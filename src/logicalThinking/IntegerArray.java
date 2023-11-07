package logicalThinking;

public class IntegerArray {


        public static void main(String[] args) {
            int[] array = { -9 , 1, 2 , 3 , 4, 5, 6 , 7 ,8 ,9 , 11};

            int min = findMinimum(array);
            int max = findMaximum(array);

            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
        }


        public static int findMinimum(int[] arr) {

            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }


        public static int findMaximum(int[] arr) {

            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

    }


