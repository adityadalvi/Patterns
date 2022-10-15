
public class SachiQspiders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 1;
		for (int i = 0; i < 5; i++) 
		{
			int diff = 1;
			int max = 1;
			cnt = max;
			if (i == 1)
				cnt = 3;
			if(i==2)
				cnt=4;
			if (i == 3)
				cnt = 10;
			if(i==4)
				cnt=11;
			for (int j = 0; j < 5; j++) 
			{
				if (j - i <= 0)
				{
					if (i % 2 != 0) 
					{
						System.out.print(cnt + " ");
						cnt = cnt - diff;
					} 
					else 
					{
						System.out.print(cnt + " ");
						cnt=cnt+diff;
					}
				}
			}
			System.out.println();
		}

	}

}
