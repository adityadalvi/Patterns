/*
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3 
       2 2 
        1
 */
public class Pattern54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
			if(j-i>=0)
			{
				System.out.print(9-i+" ");
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
