package method.q04;

public class SumNumbers {
	public static int calculateSum(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		int number1 = 3;
		int number2 = 2;

		int sum = calculateSum(number1, number2);

		System.out.println("第一引数：" + number1);
		System.out.println("第二引数：" + number2);
		System.out.println("加算結果：" + sum);
	}
}
