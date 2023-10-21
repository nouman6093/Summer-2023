import java.util.*;
public class bit_manipulation {
    public static void main(String[] args){
        //get bit:
        int n = 5;
        int position = 2;
        int bitmask = 1<<position;
        if ((bitmask & n) == 0){
            System.out.print("bit was zero");
        }else {
            System.out.println("bit was not zero");
        }

        //set bit also update bit(for operation of 1):
        int set_bit = bitmask | n;
        System.out.println(set_bit);

        //clear bit also update bit(for operation of 0):
        int clear_bit = ~(bitmask);
        System.out.println(clear_bit);
    }
}