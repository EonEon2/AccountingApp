package MyApp;
/*Value of supply (공급가) : 10,000
VAT (부가세) : 10%
Total (소비자가격) : 11,000
Expense (원가) : 30%
Income (수익) : 공급가 - 30%
배당 5 : 3 : 2 */

public class AccountingApp { //value 사용없이 app만들기

	public static void main(String[] args) {
		System.out.println("Value of supply(공급가) : " + 10000.0);
		System.out.println("VAT(부가세) : " + 10000.0*0.1);
		System.out.println("Total(소비자가격) : " + (10000.0 + 10000.0*0.1));
		System.out.println("Expense(원가) : " + 10000.0*0.3);
		System.out.println("Income(수익) : " + (10000.0 - 10000.0*0.3));
		System.out.println("divide(배당A) : " + (10000.0 - 10000.0*0.3)*0.5);
		System.out.println("divide(배당B) : " + (10000.0 - 10000.0*0.3)*0.3);
		System.out.println("divide(배당C) : " + (10000.0 - 10000.0*0.3)*0.2);

	}

}
