import java.util.Scanner;

public class test3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=1;
		int t=1;
		int result=0;
		do
		{
			if((a%2==0&&b%2==0)||(a%2!=0&&b%2!=0))
				result += t;
			a/=10;
			b++;
			t*=2;
		}while(a!=0);
		System.out.println(result);

	}

}
