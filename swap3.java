public class swap3{
    public static void main(String[] args){
        int a=5;//101 binary value
        int b=4;//100 binary value
        a=a^b;
        b=a^b;//^ --> XOR same value gives 0(false) and different value gives 1(True)
        a=a^b;
        System.out.println("After swaping the value of a is "+a);
        System.out.println("After swaping the value of b is "+b);
    }
}
