import java.util.*;
// Bill of Items
public class question {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost of pencil=");
        float pencil=sc.nextFloat();
        System.out.println("enter cost of pen=");
        float pen=sc.nextFloat();
        System.out.println("enter cost of eraser=");
        float eraser=sc.nextFloat();
        
        float total=pencil+pen+eraser;
        System.out.println("Bill is : "+total);
        
        //Add on - with 18% tax
        float newTotal=total+ (0.18f*total);
        System.out.println("Bill with 18% tax : "+newTotal);
        sc.close();
    }
}