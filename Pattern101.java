/*
    *****
   *   * 
  *   *  
 *   *   
*****    
 */
public class Pattern101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++) 
		{
			for (int j = 0; j <9; j++) 
			{
			if(j+i==4 || j+i==8 ||(i==0 && j>=5)||(i==4 && j<=4))	
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
