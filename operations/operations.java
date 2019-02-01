/*@Author:Jubin Bose
	Question10
*/

import java.util.Scanner;

class Operation{
	public static void main(String args [])
	{
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		char operator;

		System.out.println("Enter first num:");
		num1=scan.nextInt();
		System.out.println("Enter second num:");
		num2=scan.nextInt();
		System.out.println("Enter operator");
		operator=scan.next().charAt(0);


			int add =num1+num2;
			int sub =num1-num2;
			int mul =num1*num2;
			int div =(int)(num1/num2);


				switch(operator){
					case '+':
							if(add <0)
								System.out.println("Negative Number:"+add );
							else if(add ==0)
								System.out.println("Zero Number:"+add );
							else
							System.out.println("The addition of two nums are:"+add );
							break;
					case '-':
							if(sub <0)
								System.out.println("Negative Number:"+sub );
							else if(sub ==0)
								System.out.println("Zero Number:"+sub );
							else
							System.out.println("The subtraction of two nums are:"+sub );
							break;
					case '*':
							if(mul <0)
								System.out.println("Negative Number:"+mul );
							else if(mul ==0)
								System.out.println("Zero Number:"+mul );
							else
							System.out.println("The multiplication of two nums are:"+mul );
							break;
					case '/':
							if(div <0)
								System.out.println("Negative Number:"+div );
							else if(div ==0)
								System.out.println("Zero Number:"+div );
							else
							System.out.println("The division of two nums are:"+div );
							break;
					default:
							System.out.println("Illegal operator");
							break;
				}
	}
}
