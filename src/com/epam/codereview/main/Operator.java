package com.epam.codereview.main;

public class Operator {
	
	private int operand1;
	private int operand2;
	private String sign;
	
	public int getOperand1() {
		return operand1;
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	public int getOperand(String op) {
		return Integer.parseInt(op);
	}

		
	
	
}
