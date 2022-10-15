/*
*******
     * 
    *  
   *   
  *    
 *     
*******
 
 */
 
public class Pattern139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <7; i++)
		{
			for (int j = 0; j <7; j++)
			{
				if(i==0 || i==6||j+i==6)
				{
					System.out.print("*");
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

		/*int f=5,s=20;
		do {
			if(f++>--s)
			{
				continue;
			}
		} while (f<15);
		System.out.println(f+" "+s);

	}

}*/
