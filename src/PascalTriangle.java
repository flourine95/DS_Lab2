public class PascalTriangle {
    public static void printPascalTriangle(int row) {
        if (row == 0) {
            return;
        }
        printPascalTriangle(row - 1);
        printSingleRow(getPascalTriangle(row), row);
    }


    public static void printSingleRow(int[] arr, int length) {
        if (length == 1) {
            System.out.println();
            System.out.printf("%3d", arr[0]);
            return;
        }
        printSingleRow(arr, length - 1);
        System.out.printf("%3d", arr[length - 1]);
    }

    public static int[] getPascalTriangle(int n) {
        if (n == 1) {
            return new int[]{1};
        }
        return generateNextRow(getPascalTriangle(n - 1));
    }

    public static int[] generateNextRow(int[] prevRow) {
        int[] nextRow = new int[prevRow.length + 1];
        nextRow[0] = 1;
        nextRow[nextRow.length - 1] = 1;
        for (int i = 1; i < nextRow.length - 1; i++) {
            nextRow[i] = prevRow[i - 1] + prevRow[i];
        }
        return nextRow;
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

    public static void main(String[] args) {
        printPascalTriangle(5);
        int x, output;
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 2 * 4; j++) {
                x = j - 4;
                if (x < 0) {
                    x *= -1;
                }
                output = i - x;

                if (output > 0) {
                    System.out.printf("%3d", output);
                } else {
                    System.out.printf("---");
                }
            }
            System.out.println();

        }
//        printSingleRow(getPascalTriangle(5), 5);
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                if (j == 1 || j == 2 * i - 1) {
//                    System.out.print("*");
//                } else {
//                    if (i != n) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//                }
//            }
//            System.out.println();
//        }
    }
}
