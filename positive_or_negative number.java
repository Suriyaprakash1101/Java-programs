import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        if (n<0){
            System.out.println("It is negative number");
        }else{
            System.out.println("it is positive number");
        }
    }
}
