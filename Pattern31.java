/*
     A 
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
*/
public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 6; i++)
		{
			int cnt=0;
			for (int j = 0; j < 6; j++) 
			{
				if(j+i>=5)
				{
					System.out.print((char)(65+cnt++)+" ");
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
