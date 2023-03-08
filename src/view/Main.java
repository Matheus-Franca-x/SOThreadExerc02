package view;

import controller.MatrizThread;

public class Main 
{
	public static void main(String[] args)
	{
		
		MatrizThread controll = new MatrizThread();
		
		int m[][] = new int[3][5];
		
		m = controll.matriz();
		
		for(int i = 0; i < 3; i++)
		{
			controll.somaThread(m, i);
		}
	}
}
