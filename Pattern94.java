/*
*****
*  * 
* *  
**   
*    
 */
public class Pattern94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
			if(j==0 || j+i==4 ||(i==0&& j>=1 && j<=3))
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
