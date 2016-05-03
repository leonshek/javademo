import java.util.Scanner;

public class test5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String input=in.nextLine();
		int cnt=0;
		boolean flag=false;
		char c0=' ';
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' '&&input.charAt(i)!='.')
			{
				cnt++;
			}
			if(c0!=' '&&input.charAt(i)==' ')
			{
				flag=true;
			}
			else if(c0==' '||input.charAt(i)!=' ')
			{
				flag=false;
			}
			if(flag)
			{
				System.out.print(cnt+" ");
			}
			if(input.charAt(i)=='.')
			{
				System.out.print(cnt);
			}
			if(input.charAt(i)==' ')
			{
				cnt=0;
			}
			c0=input.charAt(i);
			
		}

	}

}
