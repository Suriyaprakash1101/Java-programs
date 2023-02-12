import java.util.*;
public class neon{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int mul=n*n;
        int sum=0;
        while(mul>0){
            int rem=mul%10;
            sum=sum+rem;
            mul=mul/10;
            
        }if(sum==n){
            System.out.println("It is neon number");
        }else{
            System.out.println("It is not neon number");
        }
    }
}
