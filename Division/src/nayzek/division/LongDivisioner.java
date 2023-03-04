package nayzek.division;

import java.util.ArrayList;
import java.util.List;

public class LongDivisioner {

	public DivisionResult divide(int intDividend, int divisor) {
		int dividendArrayLength, quotient;
		List<Integer> listOfQuotients = new ArrayList<Integer>();
		List<Integer> listOfReminders = new ArrayList<Integer>();
		List<Integer> listOfQuotientsMultipliedByDivisor = new ArrayList<Integer>();
		int[] dividend = convertIntegerToIntegerArray(intDividend);
		dividendArrayLength = dividend.length;
		int digitInQuotient = 0, index = 0, reminder = dividend[index];
		quotient = 0;
		if (dividend.length == 1) {
			quotient = reminder / divisor;
			listOfQuotients.add(quotient);
			reminder = reminder - quotient * divisor;
		}
		if (divisor == 0) {
			throw new ArithmeticException("divisor can t be 0");
		} else {
			calculateLongDivisioner(digitInQuotient, index, reminder, divisor, quotient, dividend, listOfQuotients,
					listOfReminders, listOfQuotientsMultipliedByDivisor);
		}
		quotient = 0;
		for (int i = 0; i < listOfQuotients.size(); i++) {
			quotient = quotient * 10 + listOfQuotients.get(i);
		}
		
		DivisionResult results= new DivisionResult( dividendArrayLength,  intDividend,  divisor,  quotient,
			 listOfReminders,  listOfQuotientsMultipliedByDivisor);
		return results;

	}

	private void calculateLongDivisioner(int digitInQuotient, int index, int reminder, int divisor, int quotient,
			int[] dividend, List<Integer> listOfQuotients, List<Integer> listOfReminders,
			List<Integer> listOfQuotientsMultipliedByDivisor) {
		while (index < dividend.length - 1) {
			if (reminder < divisor) {
				index++;
				reminder = reminder * 10 + dividend[index];
			}
			while (reminder < divisor & index < dividend.length - 1) {
				index++;
				digitInQuotient++;
				reminder = reminder * 10 + dividend[index];
			}
			listOfReminders.add(reminder);
			while (digitInQuotient > 0) {
				listOfQuotients.add(0);
				digitInQuotient--;
			}

			quotient = reminder / divisor;
			listOfQuotients.add(quotient);
			reminder = reminder - quotient * divisor;
			listOfQuotientsMultipliedByDivisor.add(quotient * divisor);
		}
	}

	public int[] convertIntegerToIntegerArray(int intDividend) {
		String[] temp = Integer.toString(intDividend).split("");
		int[] intArr = new int[temp.length];
		for (int i = 0; i < temp.length; i++) {
			intArr[i] = Integer.parseInt(temp[i]);
		}
		return intArr;
	}
}
