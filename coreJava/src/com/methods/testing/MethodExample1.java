package com.methods.testing;

 public class MethodExample1 {
	public int number1;
	private int number2;
	int number3;
	protected int number4;

	public static void main(String[] args) {
		MethodExample1 methodExample1 = new MethodExample1();
		double m1 = methodExample1.m1(15);
		System.out.println(m1);
	}

	double m1(int n) {
		System.out.println("Method 1");
		m2();
		return 5.0;//for every non void methods, return statement is mandatory 
	}

	private void m2() {//method header 
		System.out.println("Method 2"); //method body 
	}

}
//Rules for writing methods 
//1 - if the method is not returning anything then method signature will have void as return type 
//2 - if method is returning any value, it's return type must be that value's data type and return statement is mandatory 
//method signature --- 
//    access modifier    [static ]         return type    methodName(arguments)
//ex:   public                              int           m1(int i){}
//ex: 	public								void 		m2()


//public double methodname(double var)
//public static int main(String[] args)
//public static void main()
//public void main()

