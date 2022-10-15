/*
 ** ** 
*  *  *
 *   * 
  * *  
   *   
 */
public class Pattern112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j <7; j++) 
			{
				if(j-i==-1||j+i==7||(i==0&&j>=1&&j<=2)||(i==0&&j>=4&&j<=5)||(i==1&&j==3))
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
