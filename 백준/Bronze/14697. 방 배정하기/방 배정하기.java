import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = sc.nextInt();

        int result = 0;

        for (int i = 1; i * a <= total; i++) {
            if (i * a == total) {
                result = 1;
            }
            for (int j = 1; j * b <= total; j++) {
                if (j * b == total) {
                    result = 1;
                } else if (i * a + j * b == total) {
                    result = 1;
                }
                for (int k = 1; k * c <= total; k++) {
                    if (k * c == total) {
                        result = 1;
                    } else if (i * a + k * c== total) {
                        result = 1;
                    } else if (j * b + k * c == total) {
                        result = 1;
                    }
                    else if (i * a + j * b + k * c == total) {
                        result = 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
