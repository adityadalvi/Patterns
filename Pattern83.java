/*
1        1
12      12
123    123
1234  1234
1234512345
 */
public class Pattern83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++)
		{
			int cnt=0;
			for (int j = 0; j <10; j++)
			{	
				if(j-i<=0 || j+i>=9)
				{
					if(j<=4)
					{
						System.out.print(1+j);
					}
					else
					{
						System.out.print(1+cnt);
						cnt++;
					}
			
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


