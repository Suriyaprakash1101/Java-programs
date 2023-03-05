/*An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.[6:57 pm, 04/03/2023] ~𝐒𝐔𝐑𝐈𝐘𝐀 𝐏𝐑𝐀𝐊𝐀𝐒𝐇: Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels
Constraints :

2<=W
W%2=0
V<W*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        int wheel=540;
        int vehicle=200;
        int two_Wheeler=(540-70*4)/2;
        int four_Wheeler=200-two_Wheeler;
        System.out.println(two_Wheeler);
        System.out.println(four_Wheeler);
    }
}
