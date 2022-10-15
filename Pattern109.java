/*
11111
11122
11333
14444
55555
 */
public class Pattern109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++)
			{
				if(j+i>=4)
				{
					System.out.print(1+i);
				}
				else
				{
					System.out.print('1');
				}
			}
		System.out.println();	
		}
	}

}
