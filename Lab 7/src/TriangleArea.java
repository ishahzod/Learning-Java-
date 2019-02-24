//Shahzodjon Ismatov (110518374)
import java.util.*;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] points = new double[3][2];
		System.out.print("Enter x1 y1 x2 y2 x3 y3: ");
		for (int i = 0; i < points.length; i++)
			for (int j = 0; j < points[i].length; j++)
				points[i][j] = in.nextDouble();

		double area = getTriangleArea(points);

		if (area == 0) {
			System.out.println("The three points are on the same line");
		}
		else {
			System.out.printf("The area of the triangle is %.2f " , area);
		}
	}

	public static double getTriangleArea(double[][] points) {


		double A = distance(points[0][0], points[0][1], points[1][0], points[1][1]);
		double B = distance(points[0][0], points[0][1], points[2][0], points[2][1]);
		double C = distance(points[2][0], points[2][1], points[1][0], points[1][1]);
		double s = (A+B+C) / 2;
		double area = s * (s - A) * (s - B) * (s - C);

		if (area < 0.000001)
			return 0;
		else
			return Math.sqrt(area);
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}

}