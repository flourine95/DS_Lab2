public class TreeChristmas {
    public static void main(String[] args) {
        // cây thông có độ dài là 4
        drawChristmasTree(4);
    }
    public static void drawChristmasTree(int height) {
        // in ra 4 nhánh của cây thông
        drawChristmasTree(1, height);
    }

    public static void drawChristmasTree(int i, int height) {
        // nếu là gốc cây thông thì dừng
        if (i > height) {
            return;
        }
        // in ra các nhánh của cây thông
        printTree(i, height);
        // tăng sau mỗi lên in, in từ 1-4
        drawChristmasTree(i + 1, height);
        // xuống dòng sau 1 nhánh cây
        System.out.println();
    }

    public static void printTree(int h, int n) {
        // tách ra 2 trường hợp để lấy khoảng cách dễ hơn
        // nếu h không phải là gốc cây
        if (h < n) {
            for (int i = 0; i < h; i++) {
                for (int j = n - i -1; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i + 1); j++) {
                    System.out.print("X");
                }
                System.out.println();
            }
        }
        // nếu h = gốc cây
        else {
            for (int i = 0; i < h; i++) {
                for (int j = h - i - 1; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i + 1); j++) {
                    System.out.print("X");
                }
                System.out.println();
            }
        }
    }
}
