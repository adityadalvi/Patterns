/*
1        1
22      22
333    333
4444  4444
5555555555

 */
public class Pattern82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 10; j++) 
			{
			if(j-i<=0 || j+i>=9)
			{
				System.out.print(1+i);
			}
			else
			{
				System.out.print(" ");
			}
			}
		System.out.println();	
		}
	}

}
