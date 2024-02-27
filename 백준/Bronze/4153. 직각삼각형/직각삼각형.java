import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[3];

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            sortArr(arr);

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            if (arr[2] * arr[2] == arr[1] * arr[1] + arr[0] * arr[0]) {
                bw.write("right");
                bw.newLine();
            } else {
                bw.write("wrong");
                bw.newLine();
            }
        }
        bw.flush();
    }

    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
