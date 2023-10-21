import java.util.*;
public class recursion_5 {
    //print x^n;
//    public static int power(int base, int power){
//        if (power==0){
//            return 1;
//        } else if (base == 0) {
//            return 0;
//        } else {
//            int result = base * power(base,power-1);
//            return result;
//        }


        //alternative method:
        public static int power(int base, int power){
            if (power==0){
                return 1;
            } else if (base == 0) {
                return 0;
            } else if (power%2==0){ //power is even
                return power(base,power/2) * power(base,power/2);
            } else { //power is odd
                return power(base,power/2) * power(base,power/2) * base;
            }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of base: ");
        int base = sc.nextInt();
        System.out.print("Enter value of power: ");
        int power = sc.nextInt();
        int result = power(base,power);
        System.out.print(result);
    }
}