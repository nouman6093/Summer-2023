import java.util.*;
public class recursive_18 {
    //find the number of ways in which you can invite n people to your party, single or in pairs:
    public static int printWays(int n){
        if (n<=1){
            return 1;
        }
        //singles:
        int way1 = printWays(n-1);
        //pairs:
        int way2 = (n-1) * printWays(n-2);
        return way1 + way2;
    }
    public static void main(String[] args){
        int n = 4;
        int ways = printWays(n);
        System.out.println(ways);
    }
}