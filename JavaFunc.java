import java.util.*;

public class JavaFunc {
    public static int calculateSum(int x, int y) {
        x = x + y;
        // return x +y;
        return x;
    }

    public static int calculateProduct(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;
        System.out.println("Enter the value of a and b :-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch;
        do {

            System.out.println("Do you want new values:-");
            ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                System.out.println("Enter the value of a and b :-");
                a = sc.nextInt();
                b = sc.nextInt();

                System.out.println("Enter your choice:\n 1 > sum,\n 2 > product\n -1 > Exit ");
                val = sc.nextInt();
                switch (val) {
                    case 1:
                        int sum = calculateSum(a, b);

                        System.out.println("sum = " + sum);
                        break;
                    case 2:
                        int product = calculateProduct(a, b);
                        System.out.println("Product = " + product);
                    default:
                        System.out.println("Programme Exited successfully");
                        break;
                }
            } else {
                System.out.println("Enter your choice:\n 1 => sum,\n 2 => product\n -1 => Exit ");
                val = sc.nextInt();
                switch (val) {
                    case 1:
                        int sum = calculateSum(a, b);

                        System.out.println("sum = " + sum);
                        break;
                    case 2:
                        int product = calculateProduct(a, b);
                        System.out.println("Product = " + product);
                    default:
                        System.out.println("Programme Exited successfully");
                        break;
                }
            }
        } while (val != -1);
    }
}