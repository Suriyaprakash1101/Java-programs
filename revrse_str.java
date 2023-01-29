import java.util.*;
public class reverse_str{
    public static void main(String[] args){
        StringBuilder a=new StringBuilder("Suriya prakash");
        System.out.println(a);
        StringBuilder b = new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
