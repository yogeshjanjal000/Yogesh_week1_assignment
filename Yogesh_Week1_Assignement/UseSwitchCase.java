import java.util.*;
class UseSwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two no..");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(" 1. addition \n 2. subtraction \n 3. mulplication \n 4. Division");
		System.out.println("Enter choice which operation you want to perfrom...");
		int choice=sc.nextInt();

		switch(choice){
			case 1:
			int add=num1+num2;
			System.out.println("Addition = "+ add);
			break ;

			case 2:
			int sub=num1-num2;
			System.out.println("Subtraction = "+ sub);
			break ;

			case 3:
			int mul=num1*num2;
			System.out.println("Multiplication = "+ mul);
			break ;
	
			case 4:
			int div=num1/num2;
			System.out.println("Division = "+ div);
			break ;

			default:
				System.out.println("Invlid option..");
			}
		}
}
