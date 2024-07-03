package MyApp;
/*Value of supply (공급가) : 10,000
VAT (부가세) : 10%
Total (소비자가격) : 11,000
Expense (원가) : 30%
Income (수익) : 공급가 - 30%
배당 5 : 3 : 2 */

public class AccountingApp_Value { //Value 사용하여 app만들기
public static void main(String[] args) {
	double ValueOfSupply = 10000.0;
	double VAT_rate = 0.1;
	double Expense_rate = 0.3;
	
	double VAT = ValueOfSupply * VAT_rate;
	double Total = ValueOfSupply + VAT;
	double Expense = ValueOfSupply * Expense_rate;
	double Income = ValueOfSupply - Expense;
	double Divide_A = Income * 0.5;
	double Divide_B = Income * 0.3;
	double Divide_C = Income * 0.2;
	
	
	System.out.println("Value of supply(공급가) : " + ValueOfSupply);
	System.out.println("VAT(부가세) : " + VAT);
	System.out.println("Total(소비자가격) : " + Total);
	System.out.println("Expense(원가) : " + Expense);
	System.out.println("Income(수익) : " + Income);
	System.out.println("divide(배당A) : " + Divide_A);
	System.out.println("divide(배당B) : " + Divide_B);
	System.out.println("divide(배당C) : " + Divide_C);
	
			
}
}
