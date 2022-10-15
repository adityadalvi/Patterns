/*
ABBBA
BABAB
BBABB
BABAB
ABBBA
 */
public class Pattern88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <5; j++)
			{
			if(j-i==0 || j+i==4)
			{
				System.out.print("A");
			}
			else
			{
				System.out.print("B");
			}
			}
		System.out.println();	
		}
	}

}
