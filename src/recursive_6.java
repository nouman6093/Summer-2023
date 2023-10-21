import java.util.*;
//print tower of hanoi:
public class recursive_6 {
    public static void solveHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk "+n+" from " + source + " to " + destination);
            return;
        }

        solveHanoi(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        System.out.println("Steps to solve the Tower of Hanoi with " + n + " disks:");
        solveHanoi(n, 'A', 'B', 'C');
    }
}
