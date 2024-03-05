import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = sc.nextLine();
            int cnt = 0;

            if (s.equals("#")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                switch (c) {
                    case 'a', 'A' -> cnt++;
                    case 'e', 'E' -> cnt++;
                    case 'i', 'I' -> cnt++;
                    case 'o', 'O' -> cnt++;
                    case 'u', 'U' -> cnt++;
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
    }
}
