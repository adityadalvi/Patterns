/*
*****
  *  
  *  
  *  
  *  
  *  
  *  
 */
public class Pattern133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <7; i++)
		{
			for (int j = 0; j < 5; j++) 
			{
			if(i==0)
			{
				System.out.print("*");
			}
			else if(j==2 && i>0)
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
