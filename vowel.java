import java.util.*;
public class vowel{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the letter");
        char c=in.next().charAt(0);
        if (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
            System.out.println("The given letter is vowel");
        }else{
            System.out.println("The given letter is consonant");
        }
    }
}
