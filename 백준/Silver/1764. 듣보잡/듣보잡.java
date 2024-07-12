import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hs.add(sc.nextLine());
        }

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < M; i++) {
            String s = sc.nextLine();
            if (hs.contains(s)) {
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
