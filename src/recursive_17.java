import java.util.*;
public class recursive_17 {
    //place tiles of size 1xm in a floor of size nxm:
    public static int placeTiles(int n, int m){
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        //placing vertically:
        int vertically = placeTiles(n-m,m);
        //placing horizontally:
        int horizontally = placeTiles(n-1,m);
        return vertically + horizontally;
    }
    public static void main(String[] args){
        int n = 4, m = 2;
        int tiles = placeTiles(n,m);
        System.out.println(tiles);
    }
}