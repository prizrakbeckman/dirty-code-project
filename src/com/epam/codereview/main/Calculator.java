package com.epam.codereview.main;

import java.util.*;

public class Calculator {

	
	public String expressionOfCalculatingValues;
	public String sign;
	public String operand1;
	public String operand2;
	
	public Calculator(String expressionOfCalculatingValues) {
		this.expressionOfCalculatingValues = expressionOfCalculatingValues;
		
		}
	
	public Calculator(String expressionOfCalculatingValues, String sign, String operand1, String operand2) {
		this.expressionOfCalculatingValues = expressionOfCalculatingValues;
		this.sign = sign;
		this.operand1 = operand1;
		this.operand2 = operand2;
		}
	
	public Calculator(String expressionOfCalculatingValues, String sign, String operand1) {
		this.expressionOfCalculatingValues = expressionOfCalculatingValues;
		this.sign = sign;
		this.operand1 = operand1;
		}
	
	
	public static double getTheResultOfValuesFromValue() {
		
		Scanner sc = new Scanner(System.in);
		
		String expression = sc.next();
		
		String[] a = expression.split(" ");
		
		String operand1= a[0], operand2= a[2], sign= a[1];
		
		double result = 0;
		Operator op = new Operator();
		
		
		if(operand1 != null && operand2 != null && sign != null) {
			
		op.setOperand1(op.getOperand(operand1));
		op.setOperand2(op.getOperand(operand2));
		op.setSign(sign);
		
		if(op.getSign() == "*")
			result = op.getOperand1() * op.getOperand2();
		else if(op.getSign() == "+")
			result = op.getOperand1() + op.getOperand2();
		else if(op.getSign() == "-")
			result = op.getOperand1() - op.getOperand2();
		else if(op.getSign() == "/")
			result = op.getOperand1() / op.getOperand2();
		
		}
		return result;
		
	}
	
}
