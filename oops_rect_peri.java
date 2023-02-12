class rect{
    int length,width;
    rect(int x,int y){
        length=x;
        width=y;
    }
    public int perimeter(){
        int p=2*(length+width);
        return p;
    }
}
public class oops_rect_peri{
    public static void main(String[] args){
        rect o=new rect(2,4);
        System.out.println("The perimeter of the given rectangle is "+o.perimeter());
    }
}
