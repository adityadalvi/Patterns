/*
    A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA

 */
public class Pattern74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			int cnt=0;
			int cnt1=0;
			for (int j = 0; j < 9; j++) 
			{
				if(j+i>=4&&j-i<=4)
				{
					if(j<=4)
					{
						System.out.print((char)(65+cnt++));
					}
					else
					{
						System.out.print((char)(64+(i)-cnt1++));
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
