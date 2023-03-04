package nayzek.division;

import java.util.ArrayList;
import java.util.List;

public class DivisionResult {
	int dividendArrayLength, intDividend, divisor, quotient;
	List<Integer> listOfReminders = new ArrayList<Integer>();
	List<Integer> listOfQuotientsMultipliedByDivisor = new ArrayList<Integer>();
	
	

	public DivisionResult(int dividendArrayLength, int intDividend, int divisor, int quotient,
			List<Integer> listOfReminders, List<Integer> listOfQuotientsMultipliedByDivisor) {
		this.dividendArrayLength = dividendArrayLength;
		this.intDividend = intDividend;
		this.divisor = divisor;
		this.quotient = quotient;
		this.listOfReminders = listOfReminders;
		this.listOfQuotientsMultipliedByDivisor = listOfQuotientsMultipliedByDivisor;
	}

	public int getDividendArrayLength() {
		return dividendArrayLength;
	}

	public void setDividendArrayLength(int dividendArrayLength) {
		this.dividendArrayLength = dividendArrayLength;
	}

	public int getIntDividend() {
		return intDividend;
	}

	public void setIntDividend(int intDividend) {
		this.intDividend = intDividend;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	public int getQuotient() {
		return quotient;
	}

	public void setQuotient(int quotient) {
		this.quotient = quotient;
	}

	public List<Integer> getListOfReminders() {
		return listOfReminders;
	}

	public void setListOfReminders(List<Integer> listOfReminders) {
		this.listOfReminders = listOfReminders;
	}

	public List<Integer> getListOfQuotientsMultipliedByDivisor() {
		return listOfQuotientsMultipliedByDivisor;
	}

	public void setListOfQuotientsMultipliedByDivisor(List<Integer> listOfQuotientsMultipliedByDivisor) {
		this.listOfQuotientsMultipliedByDivisor = listOfQuotientsMultipliedByDivisor;
	}

	void setResults(int digitInQuotient, int index, int dividendArrayLength, int reminder, int divisor, int quotient,
			int intDividend, List<Integer> listOfQuotients, List<Integer> listOfReminders,
			List<Integer> listOfQuotientsMultipliedByDivisor) {
		setDividendArrayLength(dividendArrayLength);
		setListOfQuotientsMultipliedByDivisor(listOfQuotientsMultipliedByDivisor);
		setListOfReminders(listOfReminders);
		setQuotient(quotient);
		setIntDividend(intDividend);
		setDivisor(divisor);
	}

}
