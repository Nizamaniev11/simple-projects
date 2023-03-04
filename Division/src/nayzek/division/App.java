package nayzek.division;


import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend = scanner.nextInt();
		int divisor = scanner.nextInt();

		LongDivisioner divisioner = new LongDivisioner();
		DivisionResult computationResults = divisioner.divide(dividend, divisor);
		DivisionResultFormatter formatter = new DivisionResultFormatter();
		String resultOfformat = formatter.format(computationResults);

		System.out.println(resultOfformat);

	}

}
