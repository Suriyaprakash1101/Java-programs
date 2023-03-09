//largest and second largest, smallest and second smallest elements in arrays.
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[]a={-1,-2,03,-5,1,2,3,4,5,6,33,22,11,10};
        bubble(a);
        
        int l=a.length;
        System.out.println("The largest element in the given array is "+a[l-1]);
        System.out.println("The second largest element in the given array is "+a[l-2]);
        System.out.println("The smallest element in the given array is "+a[0]);
        System.out.println("The second smallest element in the given array is "+a[1]);
    }static void bubble(int[]a){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
}
