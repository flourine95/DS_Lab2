public class Task1_1 {

    public static int getSn1(int n) {
        if (n == 1) {
            return 1;
        }
        return (int) (getSn1(n - 1) + Math.pow(-1, n + 1) * n);
    }

    public static int getSn2(int n) {
        if (n == 1) {
            return 1;
        }
        return getSn2(n - 1) + factorial(n);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }


    public static int getSn3(int n) {
        if (n == 1) {
            return 1;
        }
        return (int) (getSn3(n - 1) + Math.pow(n, 2));
    }

    public static double getSn4(int n) {
        if (n == 0) {
            return 1;
        }
        return getSn4(n - 1) + 1f / total(n);
    }

    public static int total(int n) {
        if (n == 1) {
            return 2;
        }
        return total(n - 1) * 2 * n;
    }


    public static void main(String[] args) {
        System.out.println(getSn4(3));
        System.out.println(getSn3(3));
        System.out.println(getSn2(4));
        System.out.println(getSn1(8));

    }
}
