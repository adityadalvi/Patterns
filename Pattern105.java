/*
10101
01010
10101
01010
10101
 */
public class Pattern105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++) 
		{
			for (int j = 0; j <5; j++)
			{
			if((i+j)%2==0)
			{
				System.out.print('1');
			}
			else
			{
				System.out.print('0');
			}
			}
		System.out.println();	
		}
	}

}
