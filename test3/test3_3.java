import java.util.Scanner;

public class test3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int sum=0;
		boolean flag;
		for(int k=2,count=0;count<=m;k++)
		{
			flag=true;
			for(int i=1;i<=k;i++)
			{
				if(k%i==0&&i!=1&&i!=k)
					flag=false;
			}
			if(flag)
			{
				count++;
				if(count>=n&&count<=m)
					sum+=k;
			}
		}
		System.out.println(sum);

	}

}
