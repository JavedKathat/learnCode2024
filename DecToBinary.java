import java.util.Scanner;

class DecToBinary {
    static int  decToBinary(int n) {
        int res[] = new int[1000];
        int i=0,result=0;
        while(n>0) {
            res[i] =(n % 2);
            n /= 2;
            i++;
        }
        i= res.length-1;

        while(i>=0) {
            result = result * 10 + res[i];
            i--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Binary number is "+decToBinary(n));
    }
}
