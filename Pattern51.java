/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1
 */
public class Pattern51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j<5; j++)
			{
			if(j+i>=4 && j-i>=-4)
			{
				if(i<=4)
				{
					System.out.print(1+i+" ");
				}
				else
				{
					System.out.print(9-i+" ");
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
