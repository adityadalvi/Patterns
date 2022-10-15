/*
FEDCBA
EDCBA
DCBA
CBA
BA
A
A
BA
CBA
DCBA
EDCBA
FEDCBA
 */
public class Pattern30 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i <12; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
			if(j+i<=5 || j-i<=-6)
			{
				if(i<=5)
				{
					System.out.print((char)(70-j-i));
				}
				else
				{
					System.out.print((char)(59+i-j));
				}
			}
			}
			System.out.println();
		}
	}

}
