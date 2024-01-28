import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            String str = Integer.toString(n);
            checkStr(str);
        }
    }

    public static void checkStr(String str) {
        String[] arr1 = new String[str.length()];
        String[] arr2 = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr1[i] = String.valueOf(str.charAt(i));
        }

        for (int i = arr1.length - 1; i >= 0; i--){
            arr2[(arr1.length - 1) - i] = arr1[i];
        }

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
