//mountblue coding questions
//find the largest number in Array
public class Main{
    public static void main(String[] args){
        int[]a={10,20,30,40,50,11,12,13,1,2,3};
        System.out.println(large(a));
    }static int large(int[]a){
        int l=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>l){
                l=a[i];
            }
        }return l;
    }
}
