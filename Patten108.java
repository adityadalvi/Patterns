/*
10000
02000
00300
00040
00005
 */
public class Patten108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
			if(i==j)
			{
				System.out.print(j+1);
			}
			else
			{
				System.out.print('0');
			}
			}
		System.out.println();	
		}
	}

}
