/*
55555
45555
34555
23455
12345
 */
public class Pattern110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j <5; j++)
			{
			if(j-i<=0)
			{
				System.out.print((5-i)+j);
			}
			else
			{
				System.out.print('5');
			}
			}
		System.out.println();	
		}
	}

}
