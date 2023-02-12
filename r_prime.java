import java.util.*;
public class r_prime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the minimum number:");
        int min=in.nextInt();
        System.out.println("Enter the maximum number:");
        int max=in.nextInt();
        for (int n=min;n<max;n++){
            int flag=0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }if(flag==0){
                System.out.print(n+" ");
            }flag=0;
        }
        
    }
}
