package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),ca=1;
		while(n>0) {
			String a=in.next(),b=in.next();
			long anumber=tonumber(a),bnumber=tonumber(b);
			while(bnumber!=0) {
				long temp=bnumber;
				bnumber=anumber%bnumber;
				anumber=temp;
			}
			if(bnumber==0&&anumber!=1) {
				System.out.printf("Pair #%d: All you need is love!\n", ca);
			}
			else {
				System.out.printf("Pair #%d: Love is not all you need!\n", ca);
			}
			ca++;
			n--;
		}
		in.close();
	}
	public static long tonumber(String in) {
		long number=0;
		for(int i=in.length()-1,two=1;i>=0;i--,two*=2) {
			number+=(in.charAt(i)-'0')*two;
		}
		return number;
	}
}
