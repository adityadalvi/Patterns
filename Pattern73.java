/*
A        
ABA      
ABCBA    
ABCDCBA  
ABCDEDCBA
 */
public class Pattern73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i+=2) 
		{
			int cnt=0;
			for (int j = 0; j <9; j++) 
			{
				if(j-i<=0)
				{
					if(j<=i/2)
					{
						System.out.print((char)(65+j));
					}
					else
					{
						System.out.print((char)(64+(i/2)-cnt++));
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
