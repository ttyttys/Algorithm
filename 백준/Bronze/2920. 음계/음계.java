import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];
        int[] acs_arr = new int[8];
        int[] des_arr = new int[8];

        for (int i = 0; i < 8; i++ ){
            arr[i] = in.nextInt();
            acs_arr[i] = i + 1;
            des_arr[i] = 9 - (i + 1);
        }

        if (Arrays.equals(arr, acs_arr))
            System.out.print("ascending");
        else if (Arrays.equals(arr, des_arr))
            System.out.print("descending");
        else
            System.out.print("mixed");
    }
}
