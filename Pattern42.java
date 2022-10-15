/*
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5 
    5 
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */
public class Pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <10; i++) 
		{
			int cnt=0;
			for (int j = 0; j <5; j++) 
			{
		
				if(j-i>=0 || j+i>=9)
				{
					if(i<=4)
					{
						System.out.print((1+i+cnt++)+" ");
					}
					else
					{
						System.out.print((10-i+cnt++)+" ");
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
