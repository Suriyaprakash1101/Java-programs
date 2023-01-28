import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base value");
        int b=in.nextInt();
        System.out.println("Enter the height value");
        int h=in.nextInt();
        int c=(b*h)/2;
        System.out.println("The area of the triangle is "+c);
    }
}
