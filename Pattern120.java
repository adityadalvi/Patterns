/*
***** 
*     
*     
*  ***
*   * 
*   * 
***** 

 */
public class Pattern120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <6; j++) 
			{
				if((i==0&&j<5)||(i==6&&j<5)||(j==0&&i>=1&&i<=5)||(j==4&&i>=4&&i<=5)||(i==3&&j>=3&&j<=5))
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
