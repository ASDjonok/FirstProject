package sort;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[][] Z = {
                {3, -4, 2, 1, -4, 2, 1},
                {3, 4, -5, 1, 4, -5, 1},
                {3, -4, -5, 1, -4, -5, 1},
                {-3, 4, 6, 1, 4, 6, 1}
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
            for (int min = 0; min < Z[i].length - 1; min++) {
                int least = min;
                for (int j = min + 1; j < Z[i].length; j++) {
                    if (Z[i][j] < Z[i][least]) {
                        least = j;
                    }
                }
                int tmp = Z[i][min];
                Z[i][min] = Z[i][least];
                Z[i][least] = tmp;
                moveCount++;
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
