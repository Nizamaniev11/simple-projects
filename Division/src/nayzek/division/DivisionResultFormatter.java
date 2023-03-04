package nayzek.division;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class DivisionResultFormatter {

	public String format(DivisionResult object) {
		StringJoiner stringjoiner = new StringJoiner("");
		int dividendArrayLength = object.getDividendArrayLength();
		int intDividend = object.getIntDividend();
		int divisor = object.getDivisor();
		int quotient = object.getQuotient();
		List<Integer> listOfReminders = object.getListOfReminders();
		List<Integer> listOfQuotientsMultipliedByDivisor = object.getListOfQuotientsMultipliedByDivisor();
		List<String> results = new ArrayList<String>();
		String temp;
		results.add("_" + intDividend + "|" + divisor);
		temp = " " + listOfQuotientsMultipliedByDivisor.get(0);
		formatFirstStrings(results, temp, dividendArrayLength, listOfQuotientsMultipliedByDivisor, quotient);

		int i = 1;
		while (i < listOfQuotientsMultipliedByDivisor.size()) {
			formatTheRest(results, temp, i, listOfReminders, listOfQuotientsMultipliedByDivisor);
			i++;
		}
		temp = " " + repeatWhitespaces(i - 1)
				+ (listOfReminders.get(i - 1) - listOfQuotientsMultipliedByDivisor.get(i - 1));
		results.add(temp);
		for (int index = 0; index < results.size(); index++) {
			stringjoiner.add(results.get(index) + "\n");
		}
		return stringjoiner.toString();
	}

	private void formatFirstStrings(List<String> results, String temp, int dividendArrayLength,
			List<Integer> listOfQuotientsMultipliedByDivisor, int quotient) {
		temp += repeatWhitespaces(
				dividendArrayLength - 1 - listOfQuotientsMultipliedByDivisor.get(0).toString().length());
		temp += " |----";
		results.add(temp);
		temp = " -" + repeatWhitespaces(dividendArrayLength - 1) + "|" + quotient;
		results.add(temp);
	}

	private void formatTheRest(List<String> results, String temp, int i, List<Integer> listOfReminders,
			List<Integer> listOfQuotientsMultipliedByDivisor) {
		temp = "_" + repeatWhitespaces(i - 1) + listOfReminders.get(i);
		results.add(temp);
		temp = " " + repeatWhitespaces(i - 1) + listOfQuotientsMultipliedByDivisor.get(i);
		results.add(temp);
		temp = " " + repeatWhitespaces(i - 1) + "--";
		results.add(temp);
	}

	public String repeatWhitespaces(int n) {
		if (n == 0)
			return "";
		String temp = " ";
		while (n - 1 > 0) {
			temp += " ";
			n--;
		}
		return temp;
	}

}
