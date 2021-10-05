package chapter13;

public class Calculator implements Calculatorable{

	@Override
	public int add(int num1, int num2) {
		int result = num1+num2;
		return result;
	}

	@Override
	public int minus(int num1, int num2) {
		int result = num1-num2;
		return result;
	}

	@Override
	public int multi(int num1, int num2) {
		int result = num1*num2;
		return result;
	}

	@Override
	public double div(int num1, int num2) {
		double result = num1/(double)num2;
		return result;
	}
//	public int add(int num1, int num2){
//		return num1+num2;
//	}
//	
//	public int minus(int num1, int num2) {
//		return num1-num2;
//	}
//	
//	public int multi(int num1, int num2) {
//		return num1*num2;
//	}
//	
//	public double div(int num1, int num2) {
//		return num1/(double)num2;
//	}
}
