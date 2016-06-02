
public class TaxPayment {
	public TaxPayment() {
		
	}
	public double calculate (String income) {
		double tIncome ;
		double tTax;
		tIncome = new Double(income) - 3500;
		if (tIncome > 80000) {
			tTax = tIncome * 0.45 - 13505;
		}
		else if (tIncome > 55000) {
			tTax = tIncome * 0.35 - 5505;	
		}
		else if (tIncome > 35000) {
			tTax = tIncome * 0.3 - 2755;
		}
		else if (tIncome > 9000) {
			tTax = tIncome * 0.25 - 1005;
		}
		else if (tIncome > 4500) {
			tTax = tIncome * 0.2 - 555;
		}
		else if (tIncome > 1500) {
			tTax = tIncome * 0.1 - 105;
		}
		else if (tIncome > 0){
			tTax = tIncome * 0.03 - 0;
		}
		else {
			tTax = 0;
		}	
		return tTax;
	}

}
