package method.q06;

public class Circle {
	public static double getCircleArea(double radius) {
		double pi = 3.14;
		return radius * radius * pi;
	}

	public static void main(String[] args) {
		double radiusNum = 5.0;

		double sum = getCircleArea(radiusNum);

		System.out.println("半径：" + radiusNum);
		System.out.println("円の面積：" + sum);
	}
}
