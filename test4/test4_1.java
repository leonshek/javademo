import java.util.Scanner;

public class test4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int SIZE=in.nextInt();
		int cnt=1;
		int flag=2;
		if(SIZE==0)
		{
			int a00;
			a00=in.nextInt();
			SIZE=in.nextInt();
			if(SIZE==0)
			{
				int a11;
				a11=in.nextInt();
				System.out.println(a11);
				return;
			}
			flag=1;
		}
		int[] a=new int[SIZE+1];
		int temp0=SIZE;
		int temp;
		do{
			temp=in.nextInt();
			cnt++;
			if(cnt%2!=0)
			{
				temp0=temp;
				if(temp==0)
				{
					flag--;
				}
			}
			else if(cnt%2==0)
			{
				a[temp0]+=temp;
			}
		}while(flag>0);
		a[0]+=in.nextInt();
		boolean a0=false;
		for(int i=SIZE;i>0;i--)
		{
			if(a[i]!=0)
				a0=true;
		}
		if(a0)
		{
			for(int i=SIZE;i>=0;i--)
			{
				if(i==6&&a[i]!=0)
					System.out.print(a[i]+"x"+i+"+");
				else if(i>1&&a[i]!=0)
					System.out.print(a[i]+"x"+i+"+");
				else if(i==1&&a[i]!=0)
				{
					if(a[i]==1)
						System.out.print("x");
					else if(a[i]==-1)
						System.out.print("-"+"x");
					else
						System.out.print(a[i]+"x");
				}
				else if(i==0&&a[i]!=0)
					System.out.print("+"+a[0]);
			}
		}
		else
			System.out.println(a[0]);
		
	}
}
