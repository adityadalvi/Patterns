/*
12345
2345
345
45
4
 */
public class Pattern40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			int cnt=0;
			for (int j = 0; j <5; j++) 
			{
				if(j+i<=4)
				{
					System.out.print(1+i+cnt);
					cnt++;
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
