package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    int a, b;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b) {
        int sum1 = sum(a, b);
        System.out.println(sum1);
    }

    public static void Frac(int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul = i * i;
        }
        System.out.println(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        printSum(a, b);

        Frac(n);
    }
}
