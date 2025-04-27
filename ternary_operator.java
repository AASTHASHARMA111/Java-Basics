import java.util.*;

public class ternary_operator {

    public static void main(String args[]){

    System.out.println("enter number: ");

    Scanner sc= new Scanner(System.in);
    int number= sc.nextInt();

    String type = ((number%2) == 0) ? "even" : "odd";
    System.out.println(type);
    
}
}
