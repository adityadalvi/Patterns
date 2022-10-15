/*
    1    
   121   
  12321  
 1234321 
123454321

 */
public class Pattern72 {

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
						System.out.print(1+cnt++);
					}
					else
					{
						System.out.print(i-cnt1++);
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
