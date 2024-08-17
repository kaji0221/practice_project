package method.q08;

public class SumLoop {
	public static int sumLoop(int num1, int num2) {
		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 100;

		int result = sumLoop(number1, number2);

		System.out.println("最小値:"+number1);
		System.out.println("最大値:"+number2);
		System.out.println("加算結果:"+result);
	}
}
