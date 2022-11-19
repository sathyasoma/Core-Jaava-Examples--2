package com.assignments;

//create a Loan class properties like tenure,principal,intrestRate,accountNumber and caluculateEMI() method
//HomeLoan extends the Loan class with initilization logic print the emi per year.
class Loan {
int tenure;
double principal;
float interestRate;
String accountNumber;
public double calculateEMI(){
    double simpleInterest = (principal*interestRate*tenure)/100;
    double emi = (simpleInterest+principal)/tenure;
    return emi;
}
}
public class HomeLoan extends Loan{
	
	HomeLoan() {
	    tenure = 5; //reusing super class member variables
	    principal = 20000;
	    interestRate = 8.5f;
	    accountNumber = "Acc12345";
	  }

	public static void main(String[] args) {
	    HomeLoan hloan = new HomeLoan();
	    double amount = hloan.calculateEMI();   // sub class Object
	                                            // invoking super class method
	    System.out.println("emi per year..." + amount);
	  }

}
