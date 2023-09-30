public class Fibonacci {
    public static int getFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void printFibonacci(int n) {
        if (n == 0) {
            System.out.print(n + " ");
            return;
        }

        printFibonacci(n - 1);
        System.out.print(getFibonacci(n) + " ");
    }

    public static void main(String[] args) {
        printFibonacci(10);
    }
}
