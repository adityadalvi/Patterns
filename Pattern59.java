/*
12345
 1234
  123
   12
    1
   12
  123
 1234
12345
*/
public class Pattern59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for (int i = 0; i <9; i++)
		{
			int cnt=0;
			for (int j = 0; j < 5; j++) 
			{
				if(j-i>=0||j+i>=8)
				{
					System.out.print(1+cnt++);
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
		// TODO Auto-generated method stub
		if(i<9)
		{
			int j=0;
			int cnt=0;
			cnt=loopj(i,j,cnt);
			System.out.println();
			i++;
			loopi(i);
		}
		
	}

	private static int loopj(int i, int j, int cnt) {
		// TODO Auto-generated method stub
		if(j<5)
		{
			if(j-i>=0||j+i>=8)
			{
				System.out.print(1+cnt++);
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			return loopj(i, j, cnt);
		}
		return cnt;
		
	}

}
