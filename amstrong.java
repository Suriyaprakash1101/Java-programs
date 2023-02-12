import java.util.*;
public class amstrong{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the minimum number");
        int min=in.nextInt();
        System.out.println("Enter the maximum number");
        int max=in.nextInt();
        System.out.println("Amstrong numbers are");
        for (int i=min;i<=max;i++){
            int num=i;
            int sum=0;
            while(num>0){
                int rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }if(sum==i){
                System.out.println(i);
            }
        }
    }
}
