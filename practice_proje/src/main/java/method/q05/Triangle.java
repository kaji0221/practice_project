package method.q05;

public class Triangle {
	public static int getTriangleArea(int num1, int num2) {
		return num1 * num2 / 2;
	}

	public static void main(String[] args) {
		int base = 8;
		int height = 5;

		int sum = getTriangleArea(base, height);

		System.out.println("底辺：" + base);
		System.out.println("高さ：" + height);
		System.out.println("三角形の面積：" + sum);
	}
}
