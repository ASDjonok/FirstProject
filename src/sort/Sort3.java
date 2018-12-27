package sort;

public class Sort3 {
    public static void main(String[] args) {
        int[][] Z = {
                {3, -4, 2, 1, -4, 2, 1, 4, 6, -1, 4, -6, 1},
                {3, 4, -5, 1, 4, -5, 1, 4, 6, -1, 4, -6, 1},
                {3, -4, -5, 1, -4, -5, 1, 4, 6, -1, 4, -6, 1},
                {-3, 4, 6, 1, 4, 6, 1, 4, 6, -1, 4, -6, 1},
                {-3, 4, 6, -1, 4, -6, 1, 4, 6, -1, 4, -6, 1},
                {-3, -4, -6, -11, -14, -16, -21, -24, -26, -31, -34, -36, -41}
        };

        System.out.println("Матриця Z до перетворень:");
        for (int i = 0; i < Z.length; i++) {
            for (int j = 0; j < Z[i].length; j++) {
                System.out.print(Z[i][j] + " ");
            }
            System.out.println();
        }

        int moveCount = 0;
        for (int i = 1; i < Z.length; i+=2) {
            int buff;
            int left=0;
            int right=Z[i].length-1;
            do {
                for (int j=left; j<right;j++) {
                    if (Z[i][j]>Z[i][j+1]) {
                        buff = Z[i][j];
                        Z[i][j] = Z[i][j + 1];
                        Z[i][j + 1] = buff;
                        moveCount++;
                    }
                }
                right--;
                for (int j=right; j>left; j--) {
                    if (Z[i][j]<Z[i][j-1]) {
                        buff = Z[i][j];
                        Z[i][j] = Z[i][j - 1];
                        Z[i][j - 1] = buff;
                        moveCount++;
                    }
                }
                left++;
            } while (left <right);
        }

        System.out.println("Матриця Z після перетворень:");
        for (int i = 0; i < Z.length; i++) {
            for (int j = 0; j < Z[i].length; j++) {
                System.out.print(Z[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Кількість перестановок у кожному рядку дорівнює " + moveCount);
    }
}
