/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
public class Pattern44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i <5; i++)
		{
			for (int j = 0; j <5; j++)
			{
				if(j+i>=4)
				{
					System.out.print(1+i+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		int i=0;
		loopi(i);
	}

	private static void loopi(int i) {
		if(i<5)
		{
			int j=0;
			loopj(i,j);
			System.out.println();
			i++;
			loopi(i);
		}
	}

	private static void loopj(int i, int j) {
		// TODO Auto-generated method stub
		if(j<5)
		{
			if(j+i>=4)
			{
				System.out.print(1+i+" ");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopj(i, j);
		}
		
	}

}
