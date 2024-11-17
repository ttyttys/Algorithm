import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return - Integer.compare(o1, o2);
            }
        });

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num != 0) {
                maxHeap.add(num);
            } else {
                if (!maxHeap.isEmpty()) {
                    sb.append(maxHeap.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
