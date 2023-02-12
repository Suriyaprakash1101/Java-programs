import java.util.*;
public class lcm{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int no1=in.nextInt();
        System.out.println("Enter the second number: ");
        int no2=in.nextInt();
        int max=no1>no2?no1:no2;
        while(true){
            if(max%no1==0 && max%no2==0){
                int lcm=max;
                break;
            }max++;
            
        }System.out.println("LCM is "+max);
    }
}
