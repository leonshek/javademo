import java.util.Scanner;

public class test3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		boolean flag=true;
		Scanner in=new Scanner(System.in);
		while(flag)
		{
			int n=in.nextInt();
			if(n==-1)
			{
				flag=false;
				break;
			}
			if(n%2!=0)
				a++;
			else
				b++;
		}
		System.out.println(a+" "+b);
	}

}
