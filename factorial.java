import java.util.*;
public class factorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int mul=1;
        for (int i=1;i<=n;i++){
            mul=mul*i;
            
        }System.out.println("The factorial of the given number is "+mul);
    }
}
