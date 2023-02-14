public class pa_tri_daw{
    public static void main(String[] args){
        pattern3(5);
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n+1-row;col++){
                System.out.print("*");
            }System.out.println("");
                                //n=5+1-2
        }
    }
}
