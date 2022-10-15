/*
A     
BG    
CHM   
DINS  
EJOTY 
FKPUZ_
 */
public class Pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rcnt=0;
		for (int i = 0; i <6; i++) 
		{
			rcnt++;
			int ecnt=rcnt;
			int diff=5;
			for (int j = 0; j < 6; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(64+ecnt));
					ecnt=ecnt+diff;
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();	
		}
		/*int rcnt=0;
		int i=0;
		rcnt=loopi(i,rcnt);
	}
	private static int loopi(int i,int rcnt)
	{
		if(i<6)
		{
			rcnt++;
			int ecnt=rcnt;
			int diff=5;
			int j=0;
			ecnt=loopj(i,j,ecnt,diff);
			System.out.println();
			i++;
			return loopi(i,rcnt);
		}
		return rcnt;
	}
	private static int loopj(int i,int j,int ecnt,int diff)
	{
		if(j<6)
		{
			if(j-i<=0)
			{
				System.out.print((char)(64+ecnt));
				ecnt=ecnt+diff;
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			return loopj(i,j,ecnt,diff);
		}
		return ecnt;
	}*/
	}

}
