
public class spiralMatrix {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3, 4 },
                { 14, 15, 16, 5 },
                { 13, 20, 17, 6 },
                { 12, 19, 18, 7 },
                { 11, 10, 9, 8 },
        };

        int rowStart = 0;
        int rowEnd = a.length;
        int colStart = 0;
        int colEnd = a[0].length;

        while (rowStart < rowEnd && colStart < colEnd) {
            // left to right
            for (int i = colStart; i < colEnd; i++) {
                System.out.print(a[rowStart][i] + " ");
            }
            rowStart++;
            // top to down
            for (int i = rowStart; i < rowEnd; i++) {
                System.out.print(a[i][colEnd - 1] + " ");
            }
            colEnd--;

            // right to left
            for (int i = colEnd - 1; i >= colStart; i--) {
                System.out.print(a[rowEnd - 1][i] + " ");

            }
            rowEnd--;
            // bottom to top
            for (int i = rowEnd - 1; i >= rowStart; i--) {
                System.out.print(a[i][colStart] + " ");
            }
            colStart++;
        }

    }

}
