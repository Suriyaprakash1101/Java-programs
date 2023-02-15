public class pattern_arrow{
    public static void main(String[] args){
        pattern6(5);
    }
    static void pattern6(int n){
        for(int row=0;row<=2*n;row++){
            int tot=row>n?2*n-row:row;
            for(int col=1;col<=tot;col++){
                System.out.print("*");
            }System.out.println(" ");
        }
    }
}
