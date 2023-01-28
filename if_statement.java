import java.util.*;
public class if_statement{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        if(n<100){
            System.out.println("The given number is less than 100");
        }else{
            System.out.println("it is greater than 100");
        }
    }
}
