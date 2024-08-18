import java.util.Scanner;
class Arithmetic 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter two values which you want to perfrom arithmetic operation");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		int add= num1+num2;
		System.out.println("Addition = "+add);

		int sub= num1-snum2;
		System.out.println("Subtraction = "+sub);

		int mul= num1*num2;
		System.out.println("Multplication = "+mul);

		double div= num1/num2;
		System.out.println("Division = "+div);
	}
}
