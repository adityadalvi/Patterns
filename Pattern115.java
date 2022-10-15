/*
****
*   *
*   *
****
*   *
*   *
****
 */
public class Pattern115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i <irange; i++)
		{
			for (int j = 0; j <jrange; j++) 
			{
				
				if(((i==0||i==3||i==6)&&j<=3)||((j==0||j==4)&&
					(i>=1&&i<=2))||(j==0||j==4)&&(i>=4&&i<=5))
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
