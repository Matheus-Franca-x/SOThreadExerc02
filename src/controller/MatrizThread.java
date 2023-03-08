package controller;

import java.util.Random;

public class MatrizThread 
{
	
	public int[][] matriz()
	{
		Random r = new Random();
		
		int m[][] = new int[3][5];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				m[i][j] = r.nextInt(11) + 1;
			}
		}

		return m;	
	}
	
	
	public void somaThread(int[][] m, int num)
	{
		new Thread()
		{
			public void run()
			{
				int soma = 0;
				for(int i = 0; i < 5; i++)
				{
					soma += m[num][i];
				}
				System.out.println(num + " - " + soma);
			}
		}.start();
	}
	
	
	
	
	
	
	
}
