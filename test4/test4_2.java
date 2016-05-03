import java.util.Scanner;

public class test4_2 {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int SIZE;
		SIZE=in.nextInt();
		int[][] board=new int[SIZE][SIZE];
		boolean gotResult=false;
		int numOfX=0;
		int numOfO=0;
		
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=in.nextInt();
			}
		}
		
		//-
		if(!gotResult)
		{
			for(int i=0;i<SIZE;i++)
			{
				for(int j=0;j<SIZE;j++)
				{
					if(board[i][j]==1)
						numOfX++;
					else
						numOfO++;
				}
				
				if(numOfX==SIZE||numOfO==SIZE)
				{
					gotResult=true;
					break;
				}
				else
				{
					numOfO=0;
					numOfX=0;
				}
			}
		}
		
		//|
		if(!gotResult)
		{
			for(int i=0;i<SIZE;i++)
			{
				for(int j=0;j<SIZE;j++)
				{
					if(board[j][i]==1)
						numOfX++;
					else
						numOfO++;
				}
				
				if(numOfX==SIZE||numOfO==SIZE)
				{
					gotResult=true;
					break;
				}
				else
				{
					numOfO=0;
					numOfX=0;
				}
			}
		}
		
		//\
		if(!gotResult)
		{
			for(int i=0;i<SIZE;i++)
			{
				if(board[i][i]==1)
					numOfX++;
				else
					numOfO++;
			}	
			if(numOfX==SIZE||numOfO==SIZE)
			{
				gotResult=true;
			}
			else
			{
				numOfO=0;
				numOfX=0;
			}
		}
		
		///
		if(!gotResult)
		{
			for(int i=0;i<SIZE;i++)
			{
				if(board[i][SIZE-1-i]==1)
					numOfX++;
				else
					numOfO++;
			}	
			if(numOfX==SIZE||numOfO==SIZE)
			{
				gotResult=true;
			}
			else
			{
				numOfO=0;
				numOfX=0;
			}
		}
		
		//result
		if(gotResult)
		{
			if(numOfX==SIZE)
				System.out.print("X");
			else
				System.out.print("O");
		}
		else
			System.out.print("NIL");
	}

}
