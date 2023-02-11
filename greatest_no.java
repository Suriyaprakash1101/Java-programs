import java.util.*;
public class greatest_no{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=in.nextInt();
        System.out.println("Enter the second number");
        int n2=in.nextInt();
        System.out.println("Enter the third number");
        int n3=in.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println("The greatest number is "+n1);
        }
        else if(n2>n3&&n2>n1){
            System.out.println("The greatest number is "+n2);
        }
        else{
            System.out.println("The greatest number is "+n3);
        }
    }
}
