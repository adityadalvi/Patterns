/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Pattern57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++)
			{
			if(j-i<=0)
			{
				System.out.print(1+cnt+" ");
				cnt++;
			}
			}
		System.out.println();	
		}
	}

}
