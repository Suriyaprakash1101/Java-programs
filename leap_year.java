import java.util.*;
public class leap_year{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the year");
        int n=in.nextInt();
        if(n%4==0||n%400==0){
            System.out.println("The given year is leap year");
        }
    }
}
