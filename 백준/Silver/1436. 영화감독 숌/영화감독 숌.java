import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = FindNumber(N);
        System.out.println(result);
    }

    public static int FindNumber(int N) {
        int num = 666;
        int count = 0;

        while (true) {
            if (CheckSix(num)) {
                count++;
            }
            if (N == count) {
                return num;
            }
            num++;
        }
    }

    public static boolean CheckSix(int num) {
        String str = Integer.toString(num);
        return str.contains("666");
    }

}