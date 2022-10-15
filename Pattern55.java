/*
1 
12
123
1234
12345
1234
123
12
1
 */
public class Pattern55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <9; i++) 
		{
			for (int j = 0; j < 5; j++)
			{
			if(j-i<=0 && j+i<=8)
			{
				System.out.print(1+j);
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
