import java.util.Scanner;

public class SolutionFourth {
    public static int recursion(int k, int s) {
        if (s < 0) { // если сумма цифр стала отрицательной, то такое число не подходит
            return 0;
        }
        if (k == 0) { // если мы использовали все k цифр и сумма оказалась равной d, то это подходящее число
            return (s == 0) ? 1 : 0;
        }
        int count = 0;
        for (int i = (k == 1) ? 1 : 0; i <= 9; i++) { // если это первая цифра числа, то она не может быть 0
            count += recursion(k - 1, s - i); // рекурсивно вызываем функцию для оставшихся цифр и уменьшаем сумму на текущую цифру
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(recursion(n, m)); // вызов рекурсивной
    }
}
