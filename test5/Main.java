import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String s=null;
		String s1,s2,str1,str2,str3;
		int flag=1;
		s1=in.nextLine();
		while(flag==1)
		{
			boolean flag1=false,flag2=false;
			if(!(s1.substring(0,6)).equals("$GPRMC"))
				s1=in.nextLine();
			int n1=s1.indexOf("$")+1;
			int n2=s1.indexOf("*");
			String yihuo=s1.substring(n1,n2);
			int k=yihuo.charAt(0)^yihuo.charAt(1);
			for(int i=2;i<yihuo.length();i++)
			{
				k=k^yihuo.charAt(i);
			}
			k=k%65536;
			str1=Integer.toHexString(k);
			str2=s1.substring(n2+1);
			if(str1.equals(str2))
				flag1=true;
			str3=s1.substring(n2-1, n2);
			if(str3.equals("A"))
				flag2=true;
			if(flag1&&flag2)
				s=s1;
			s1=in.nextLine();
			if(s1.equals("END"))
				flag=0;
		}
		int n=s.indexOf("$GPRMC,")+7;
		String hour=s.substring(n, n+2);
		String min=s.substring(n+2, n+4);
		String sec=s.substring(n+4, n+6);
		int h=Integer.parseInt(hour);

		
		h=h+8;
		if(h>=24)
			h=h-24;
		if(h<10)
			System.out.print("0"+h);
		else
			System.out.print(h);
		System.out.print(":"+min+":"+sec);

	}

}

/*
//正确答案
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String now = null;
		String str = in.nextLine();
		String judge = new String("END");
		String right = new String("$GPRMC");
		while(!str.equals(judge))//输入为END ，结束输入
		{
			String[] ss = str.split(",");//以逗号为分割 吧str分割为若干字符串 放入数组ss
			
			if(!ss[0].equals(right))//如果第一个逗号以前的部分不为所要求，读入下一列，结束这一行处理
				{str=in.nextLine();continue;}
			boolean tag=false;
			int i,result=0;
			char ch;
			
			ch=str.charAt(1);//从第二个字符开始做异或，存入result
			for(result=str.charAt(1),i=2;ch!='*';i++,ch=str.charAt(i)){
				ch=str.charAt(i);
				result^=(int)ch;
			}
			result%=65536;
			String num = str.substring(i+1, i+3);//取*后面两位
			
			char state = ss[2].charAt(0);
			num=num.toLowerCase();//转化为小写
			if(num.equals(Integer.toHexString(result))&&state=='A')//如果相同 且 状态为A 存入时间
				now=ss[1];
			str=in.nextLine();
		}
		if(now==null)System.exit(0);
		String hh=now.substring(0, 2);
		String mm =now.substring(2, 4);
		String ss =now.substring(4, 6);
		int hour = Integer.parseInt(hh);
		hour=(hour+8)%24;
		if(hour<10)
			System.out.print(0);
		System.out.println(hour+":"+mm+":"+ss);//输出时间
	}
}*/