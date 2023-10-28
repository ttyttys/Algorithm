import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int score = 0;

        String str = null;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            score = 0;
            str = in.next();
            for (int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 'O') {
                    cnt++;
                    score = score + cnt;
                }else if (str.charAt(j) == 'X'){
                    cnt = 0;
                }
            }
            System.out.println(score);
        }
    }
}