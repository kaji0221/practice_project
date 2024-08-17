package method.q10;

public class EvenNumbers {
	public static int getEvenNumbers(int[] numbers) {
		int evenNumber = 0;

		for (int number : numbers) {
			if (number % 2 == 0) {
				evenNumber++;
			}
		}
		return evenNumber;
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };

		int evenNumber = getEvenNumbers(numbers);

		System.out.print("[");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);

			if (i < numbers.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.println("]には、偶数が" + evenNumber + "個あります。");
	}
}
