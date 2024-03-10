import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s[0].length(); i++) {
            char temp = s[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (temp != s[j].charAt(i)) {
                    answer.append('?');
                    break;
                }

                if (j == n - 1) {
                    answer.append(temp);
                }
            }
            if (n == 1) {
                answer.append(temp);
            }
        }
        System.out.println(answer);
    }
}
