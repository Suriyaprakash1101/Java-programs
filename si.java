import java.util.*;
public class si{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount did you get ");
        int p=in.nextInt();
        System.out.println("Enter how many years ");
        int n=in.nextInt();
        System.out.println("Enter the percentage ");
        int r=in.nextInt();
        int s=(p*n*r)*1/100;
        System.out.println(s);
    }
}
