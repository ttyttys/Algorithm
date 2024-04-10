import java.io.*;
import java.util.*;

class Point implements Comparable<Point> {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if(this.y == o.y) return this.x - o.x;
		else return this.y - o.y;
	}

}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        		StringTokenizer st;
        		ArrayList<Point> sortedList = new ArrayList<Point>();

        		int n = Integer.valueOf(br.readLine());
        		int x, y;
        		while(n --> 0) {
        			st = new StringTokenizer(br.readLine());

        			x = Integer.valueOf(st.nextToken());
        			y = Integer.valueOf(st.nextToken());

        			sortedList.add(new Point(x, y));
        		}

        		Collections.sort(sortedList);

        		StringBuilder sb = new StringBuilder();
        		for(Point p : sortedList) {
        			sb.append(p.x + " " + p.y + "\n");
        		}
        		System.out.println(sb);

        		br.close();
    }
}
