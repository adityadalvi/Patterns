/*
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 
 */
public class IMPPattern6Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			for (int j = 5; j >i+1; j--)
			{
				System.out.print(" ");
			}
			int num=1;
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}

}
