/*
A
BB
CCC
DDDD
EEEEE
DDDD
CCC
BB
A
*/
public class Pattern27 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i <9; i++) 
		{
			for (int j = 0; j <5; j++) 
			{
				if(j-i<=0&&j+i<=8)
				{
					if(i<=4)
					{
						System.out.print((char)(65+i));
					}
					else
					{
						System.out.print((char)(73-i));
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



