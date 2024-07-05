import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int blue;
    static int white;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        arr = new int[k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        divide(arr, 0, k - 1, 0, k - 1);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void divide(int[][] arr, int startX, int endX, int startY, int endY) {
        int chk = check(arr, startX, endX, startY, endY);
        if (chk == 1) {
            blue++;
        } else if (chk == 0) {
            white++;
        } else {
            int midX = (startX + endX) / 2;
            int midY = (startY + endY) / 2;

            divide(arr, startX, midX, startY, midY);
            divide(arr, startX, midX, midY + 1, endY);
            divide(arr, midX + 1, endX, startY, midY);
            divide(arr, midX + 1, endX, midY + 1, endY);
        }
    }

    public static int check(int[][]arr, int startX, int endX, int startY, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if (arr[i][j] != arr[startX][startY]) {
                    return -1;
                }
            }
        }
        return arr[startX][startY];
    }
}
