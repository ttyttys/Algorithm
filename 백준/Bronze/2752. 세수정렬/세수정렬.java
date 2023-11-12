import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();

        if(a < b && a < c){
            if(b < c)
                System.out.printf("%d %d %d", a, b, c);
            else
                System.out.printf("%d %d %d", a, c, b);
        }
        else if(b < a && b < c){
            if(a < c)
                System.out.printf("%d %d %d", b, a, c);
            else
                System.out.printf("%d %d %d", b, c, a);
        }
        else if(c < a && c < b) {
            if (a < b)
                System.out.printf("%d %d %d", c, a, b);
            else
                System.out.printf("%d %d %d", c, b, a);
        }
    }
}
