/*  Check if a num is even or odd */


import java.util.*;

public class if_else_example {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }

    }
    
}
