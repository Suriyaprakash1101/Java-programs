import java.util.*;
public class perimeter_rect{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int l=in.nextInt();
        System.out.println("Enter the breath of the rectangle");
        int b=in.nextInt();
        int p=2*(l+b);
        System.out.println("The perimeter of the rectangle is "+p);
    }
}
