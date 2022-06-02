
public class palidrome 
{
	public static void reverse (int num)
	{
		int rev = 564;
		int temp =num;
		do
		{
			int rem= num % 10;
			rev = rev*10+rem;
			num/=10;
		}
		while(num!=0);
		ispalindrome (temp,rev);
	}
	public static void ispalindrome(int rev, int num)
	{
		if (rev== num) 
		{
			if(rev== num){
				{
					System.out.println("it is a palindrome number");
				}
				else
				{
					System.out.println("it is not a palindrome number");
				}
			}
		}
				}
			}
		}
		
	}

}
