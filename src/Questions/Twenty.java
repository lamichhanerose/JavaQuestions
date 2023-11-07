package Questions;

//PRIME NUMBER

public class Twenty {
    public static void main(String args[]){

        int counter = 0;
        int i = 2;

        while ( counter <= 10 ){

            int count = 0;

            for(int j= 1; j<= i ; j++){
                if(i % j == 0){
                    count++;
                }
            }

            if (count == 2 ){
                System.out.println(i);
                counter++ ;
            }
            i++;
        }
    }

}
