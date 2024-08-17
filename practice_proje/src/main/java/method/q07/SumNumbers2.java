package method.q07;

public class SumNumbers2 {
	public static int calculateSum(int num1, double num2) {
		return (int) (num1 + num2);
	}

	public static void main(String[] args) {
		int number1 = 5;
		double number2 = 3.3;

		int result = calculateSum(number1, number2);

		System.out.println("第一引数(整数):"+number1);
		System.out.println("第二引数(実数):"+number2);
		System.out.println("加算結果:"+result);
	}
}
