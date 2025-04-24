public class if_else {

    public static void main(String args[]) {
        int age= 15;
        if (age>=18) {
            System.out.println("adult: drive, vote");
        }
        if(age > 13 && age < 18) {
            System.out.println("teenageer");
        }
        else{
            System.out.println("not adult");
        }
    }  
}
