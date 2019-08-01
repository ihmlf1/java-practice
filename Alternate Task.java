package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int Case=1,n;
		while((n=in.nextInt())!=0) {
			if(n==1) {
				System.out.printf("Case %d: %d\n", Case,n);
			}
			else {
				System.out.printf("Case %d: %d\n", Case,factor(n));
			}
			Case++;
		}
		in.close();
	}
	static int factor(int in) {
		for(int j=in-1;j>0;j--) {
		int total=0;
		for(int i=1;i<=java.lang.Math.sqrt(j);i++) {
			if(j%i==0) {
				if(j/i==i) {
					total+=i;
				}
				else {
					total=total+j/i+i;
				}
			}
		}
		if(in==total) {
			return j;
			}
		}
		return -1;
	}
}
