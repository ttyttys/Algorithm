import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            int i = sc.nextInt();
            if (i == 0) {
                stack.pop();
            } else {
                stack.push(i);
            }
        }

        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }

        System.out.println(sum);
    }
}
