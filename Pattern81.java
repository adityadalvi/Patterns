/*
1		 1
12		21
123	   321
1234  4321
1234554321
 */
public class Pattern81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 10; j++)
			{
			if(j-i<=0 || j+i>=9)
			{
				if(j<=4)
				{
					System.out.print(1+j);
				}
				else if(j>=4)
				{
					System.out.print(10-j);
				}
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
		
			//CS.34
			 /*int I = 0;
		        outer:
		            while (true)
		            {
		                I++;
		                
		                inner:
		                    for (int i = 0; i < 20; i++)
		                    {
		                        I += i;
		            
		                        if (i == 2 || i == 3 || i == 4 || i == 5)
		                            continue inner;
		                        break outer;
		                    }
		                    continue outer;
		            }
		            System.out.println(I);*/
		
		/*int[][] input = {{3, 5, 6, 7}, {2, 4}, {1}, {2, 3, 4, 5}};
		myCode(input);
		}

		private static void myCode(int[][] input)
		{
	        int  result = 1;
	        
	        for(int i = 0; i < input.length; i++)
	        {
	            for(int j = 0; j < input[2].length; j++)
	            {
	                result *= input[i][j];
	            }
	        }
	        System.out.println("Result = " + result);
		
		}
		}*/
	
