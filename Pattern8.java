/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 */
public class Pattern8 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++)
		{
			for (int j = 0; j <5; j++)
			{
				if(j+i>=4&&j-i>=1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
		System.out.println();	
		}
		for (int i = 0; i <4; i++)
		{
			for (int j = 0; j <5; j++)
			{
				if(j-i>=1)
				{
					System.out.print("*");
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
