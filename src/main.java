import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        System.out.println(getSn4(3));
//        System.out.println(getSn3(3));
//        System.out.println(getSn2(4));
//        System.out.println(getSn1(8));
//        System.out.println(getFibonacci(8));
//        printFibonacci(10);
//        printMatrix(createMatrixPascal(3));
        System.out.println(Arrays.toString(generateNextRow(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(getPascalTriangle(4)));

    }

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

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] generateNextRow(int[] curRow) {
        int[] nextRow = new int[curRow.length + 1];
        nextRow[0] = 1;
        nextRow[nextRow.length - 1] = 1;
        for (int i = 0; i < nextRow.length - 2; i++) {
            nextRow[i + 1] = curRow[i] + curRow[i + 1];
        }
        return nextRow;
    }

    public static int[] getPascalTriangle(int row) {
        if (row == 1) {
            return new int[]{1};
        }
        int[] prevRow = getPascalTriangle(row-1);
        return generateNextRow(prevRow);
    }

    public static int[][] createMatrixPascal(int row) {
        int[][] matrix = new int[row][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[i + 1];
            matrix[i][i] = 1;
            matrix[i][0] = 1;
            for (int j = 1; j < matrix[i].length - 1; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }
        return matrix;
    }
}
