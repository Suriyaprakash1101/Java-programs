public class Main{
    public static void main(String[] args){
        int[]a={10,20,30,40,50,11,12,13,1,2,3};
        System.out.println(small(a));
    }static int small(int[]a){
        int s=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<s){
                s=a[i];
            }
        }return s;
    }
}
