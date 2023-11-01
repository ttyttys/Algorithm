import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0.0;
        double b_sum = 0.0;
        double d = 0.0;

        for(int i = 0; i < 20; i++){
            String a = in.next();
            double b = in.nextDouble();
            String c = in.next();
            if (c.equals("A+")){
                d = 4.5;
            }else if (c.equals("A0")){
                d = 4.0;
            }else if (c.equals("B+")){
                d = 3.5;
            }else if (c.equals("B0")){
                d = 3.0;
            }else if (c.equals("C+")){
                d = 2.5;
            }else if (c.equals("C0")){
                d = 2.0;
            }else if (c.equals("D+")){
                d = 1.5;
            }else if (c.equals("D0")){
                d = 1.0;
            }else if (c.equals("F")){
                d = 0.0;
            }
            else{
                d = 0.0;
                b_sum -= b;
            }
            sum += b * d;
            b_sum += b;
        }
        double res = sum / b_sum;
        System.out.println(res);
    }
}