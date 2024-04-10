import java.util.Scanner;

public class JavaFunc2 {

    public static void calculateFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("factorial = " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate Factorial:-");
        int n = sc.nextInt();
        calculateFactorial(n);
        sc.close();
    }
}
