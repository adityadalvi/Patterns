/*
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */
public class Pattern60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i<9; i++) 
		{
			int cnt=0;
			for (int j = 0; j < 5; j++)
			{
			if(j-i>=0 || j+i>=8)
			{
				if(i<=4)
				{
					System.out.print(1+cnt+" ");
					cnt++;
				}
				else
				{
					System.out.print((9-i)+cnt+" ");
					cnt++;
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
