import java.util.*;
public class Main{
    public static void main(String[] args){
        int[]a={10,20,25,30};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }System.out.println(count);
    }
    
}
