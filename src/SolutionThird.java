import java.util.Scanner;

public class SolutionThird {
    public static void recursion(int n, int m) {
        if (n < m) {
            System.out.print(n + " ");
            recursion(n + 1, m);
        } else if (n > m) {
            System.out.print(n + " ");
            recursion(n - 1, m);
        } else {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        recursion(n, m); // вызов рекурсивной
    }
}