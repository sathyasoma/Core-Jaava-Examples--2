package com.cg.eis.exception;

import java.util.Scanner;


/*Create an Exception class named as “EmployeeException”(User defined Exception) 
in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is 
below than 3000. Use Exception Handling mechanism to handle exception properly.*/






class EmployeeException extends Throwable{
	public  EmployeeException(String errorMsg)
	{super(errorMsg);
	}
}
public class Program6
{
	 void validation(int salary) throws EmployeeException{
		if(salary<3000)
			throw new EmployeeException("Salary of an employee is less than 3000.");
		else
			System.out.println("Salary of an employee is "+salary);
	}
	public static void main(String[] args) throws EmployeeException {
		Program6 p=new Program6();
		Scanner s=new Scanner(System.in);
		int salary=s.nextInt();
		p.validation(salary);
		s.close();
	}
}
