//to find the minimum number of the given array
public class Main{
    public static void main(String[] args){
        int[]arr={10,20,40,-1,-2,-3,-4};
        System.out.println(min(arr));
    }static int min(int[]a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }return min;
    }
}
