import java.util.Scanner;

public class SolutionSecond {
    public static void recursion(int n) {
        if (n == 1) { // Условие остановки
            System.out.print(1);
        } else { // Условие продолжения
            recursion(n - 1);
            System.out.print(" " + n);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n); // вызов рекурсивной
    }
}