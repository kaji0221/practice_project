package method.q09;

public class Even {
	public static boolean checkEven(int num1) {
		return num1 % 2 == 0;
	}

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 5;

		if (checkEven(number1)) {
			System.out.println(number1 + "は偶数です。");
		} else {
			System.out.println(number1 + "は奇数です。");
		}

		if (checkEven(number2)) {
			System.out.println(number2 + "は偶数です。");
		} else {
			System.out.println(number2 + "は奇数です。");
		}
	}
}
