/*
    N
   N 
  N  
 N   
N    

 */
public class Pattern91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <5; j++)
			{
			if(j+i==4)
			{
				System.out.print("N");
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
