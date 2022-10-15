/*
*     *
**   **
* * * *
*  *  *
*     *
*     *
*     *
 */
public class Pattern126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <7; i++)
		{
			for (int j = 0; j <7; j++) 
			{
			if(j==0 || j==6)
			{
				System.out.print("*");
			}
			else if((j-i==0 && i<=3) || (j+i==6&& i<=3))
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
