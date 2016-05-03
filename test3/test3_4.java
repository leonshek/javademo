import java.util.Scanner;

public class test3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		if(n<0)
		{
			System.out.print("fu ");
			n*=-1;
		}
		int digit;
		int temp=n;
		for(digit=1;;digit++)
		{
			temp/=10;
			if(temp==0)
				break;
		}
		int pinyin=0;
		String a=null;
		temp=n;
		for(int i=digit;i>0;i--)
		{
			int t=temp;
			for(int k=i;k>0;k--)
			{
				pinyin=t%10;
				t/=10;
			}
			switch(pinyin)
			{
			case 0:
				a="ling";break;
			case 1:
				a="yi";break;
			case 2:
				a="er";break;
			case 3:
				a="san";break;
			case 4:
				a="si";break;
			case 5:
				a="wu";break;
			case 6:
				a="liu";break;
			case 7:
				a="qi";break;
			case 8:
				a="ba";break;
			case 9:
				a="jiu";break;
			}
			System.out.print(a);
			int t1=1;
			for(int k=i-1;k>0;k--)
			{
				t1*=10;
			}
			temp%=t1;
			if(i>1)
				System.out.print(" ");
		}
	}

}
