import java.util.*;

public class operation {
    void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    void sub(int a, int b) {
        int diff = a - b;
        System.out.println(diff);
    }

    void mul(int a, int b) {
        int prod = a * b;
        System.out.println(prod);
    }

    void divide(int a, int b) {
        int div = a / b;
        System.out.println(div);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nos.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        operation op = new operation();
        op.sum(a, b);
        op.sub(a, b);
        op.mul(a, b);
        op.divide(a, b);
        scan.close();
    }
}