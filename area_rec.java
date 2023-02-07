import java.util.*;
class rectangle{
    int length,width;
    public void getdetail(int x,int y){
        length=x;
        width=y;
    }
    public int area(){
        int a = length*width;
        return a;
        
    }
}
public class area_rec{
    public static void main(String[] args){
        rectangle r=new rectangle();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length: ");
        r.length=in.nextInt();
        System.out.println("Enter the width: ");
        r.width=in.nextInt();
        System.out.println("The are of rectangle "+r.area());
    }
}
