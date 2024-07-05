import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        long index = 0;
        while (N > 0) { //1, 2, 3, 4 사분면으로 구분하자. 왼쪽 상단이 1이고, 오른쪽 상단이 2, 왼쪽 하단이 3, 오른쪽 하단이 4다.
            long temp = 1L << (N - 1);
            if(r < temp && c >= temp) { // 2사분면
                index += temp * temp;
                c -= temp;  // 수정된 부분
            }
            else if(r >= temp && c < temp) { // 3사분면
                index += 2 * temp * temp;
                r -= temp;  // 수정된 부분
            }
            else if(r >= temp && c >= temp) { // 4사분면
                index += 3 * temp * temp;
                r -= temp;  // 수정된 부분
                c -= temp;  // 수정된 부분
            }
            N--;
        }
        System.out.print(index);
    }
}