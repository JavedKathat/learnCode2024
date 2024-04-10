import java.util.*;

public class JavaFunc {
    public static int calculateSum(int x, int y) {
        x = x + y
        // return x +y;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);

        System.out.println("sum = " + sum);
    }
}