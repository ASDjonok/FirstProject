package sort;

public class Sort2 {
    public static void main(String[] args) {
        int[][] Z = {
                {3, -4, 2},
                {3, 4, -5},
                {-3, 4, 6}
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
            for (int j = 1; j < Z[i].length; j++) {
                int x = Z[i][j];
                int k = j;
                while (k > 0 && Z[i][k-1] > x) {
                    Z[i][k] = Z[i][k-1];
                    k--;
                    moveCount++;
                }
                Z[i][k] = x;
            }
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
