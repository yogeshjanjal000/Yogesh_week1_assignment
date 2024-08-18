import java.util.Scanner;
class EvenOddNo  
{
	public static void main(String[] args) 
	{
		System.out.println("Enrter The no....");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();

		if(no%2==0)
			System.out.println("Given no is even no...");
		else
			System.out.println("Given no is odd no...");
	}
}
