import java.util.*;
public class prime_no{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        int j=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                j++;
            }
            
        }System.out.println(j);
        if(j==2){
            System.out.println("The given number is prime number");
        }else{
            System.out.println("The given number is not prime number");
        }
        
    }
}
