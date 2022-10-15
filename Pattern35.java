/*
A
BC
DEF
GHIJ
KLMNO
PQRSTU
 */
//for continuous addition takr cnt out of i loop(completely outside)
public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		for (int i = 0; i <6; i++)
		{
			
			for (int j = 0; j <6; j++)
			{
				
			if(j-i<=0)
			{
				System.out.print((char)(65+cnt));
				cnt++;
			}
			}
		System.out.println();	
		}
	}

}
