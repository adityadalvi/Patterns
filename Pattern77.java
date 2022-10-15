/*
1     
2 6    
3 7 10   
4 8 11 13  
5 9 12 14 15 
 */
public class Pattern77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rcnt=0;
		for (int i = 0; i < 5; i++)
		{
			rcnt++;
			int ecnt=rcnt;
			int diff=4;
			for (int j = 0; j <5; j++)
			{
				if(j-i<=0)
				{
					System.out.print(ecnt+" ");
					ecnt=ecnt+diff--;
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
