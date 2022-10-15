/*
1  2  3  4  
12  13  14  5  
11  16  15  6  
10  9  8  7  

 */
public class SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[4][4];
		int cnt=1;
		int imin=0;
		int jmin=0;
		int imax=a.length-1;
		int jmax=a.length-1;
		
		while(cnt<=a.length*a.length)
		{
			int i=imin;
			for(int j=jmin;j<=jmax;j++)
			{
				a[i][j]=cnt++;
			}
			int j=jmax;
			for (i=imin+1; i <= imax; i++)
			{
				a[i][j]=cnt++;
			}
			i=imax;
			for (j = jmax-1; j >= jmin; j--)
			{
				a[i][j]=cnt++;
			}
			j=jmin;
			for (i = imax-1; i > imin; i--)
			{
				a[i][j]=cnt++;
			}
			imin++;jmin++;imax--;jmax--;
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
