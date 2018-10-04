import java.util.Scanner;
public class PhoneNumSubstring {

	public static void main(String[]args)
	{
		Scanner userNum = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = userNum.nextLine();
		System.out.print("Please enter your 10 digit phone number (in xxxxxxxxxx format): " );
		String phoneNum = userNum.nextLine();
		String phoneNew = "("+phoneNum.substring(0,3)+ ")"+ phoneNum.substring(3, 6) + "-" + phoneNum.substring(6, 10);
		System.out.printf("%20s %s", name, phoneNew);
		userNum.close();
		
	}
}
